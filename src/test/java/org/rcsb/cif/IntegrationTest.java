package org.rcsb.cif;

import org.junit.Test;
import org.rcsb.cif.model.CifFile;
import org.rcsb.cif.model.Column;
import org.rcsb.cif.model.FloatColumn;
import org.rcsb.cif.model.builder.CifBuilder;
import org.rcsb.cif.model.text.TextColumn;
import org.rcsb.cif.schema.DelegatingFloatColumn;
import org.rcsb.cif.schema.StandardSchemas;
import org.rcsb.cif.schema.mm.generated.AtomSite;
import org.rcsb.cif.schema.mm.generated.MmCifBlock;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.Assert.*;
import static org.rcsb.cif.TestHelper.TEST_CASES;
import static org.rcsb.cif.TestHelper.assertEqualsLoosely;

/**
 * More complex tests for interactions between various parts of the code. Especially round-trip are used to assess the
 * fidelity of the implementation. For a Cif file encoding and subsequent decoding should arrive at the original file
 * content. For Bcif decoding and encoding should do the same.
 */
public class IntegrationTest {
    @Test
    public void testBehaviorForEmptyFiles() throws IOException {
        CifFile cifFile = new CifBuilder()
                .enterBlock("test")
                .enterCategory("atom_site")
                .leaveCategory()
                .leaveBlock()
                .leaveFile();
        byte[] bytes = CifIO.writeBinary(cifFile);
        CifFile read = CifIO.readFromInputStream(new ByteArrayInputStream(bytes));

        assertEquals(0, read.getBlocks().get(0).getCategoryNames().size());
    }

    @Test
    public void testVectorAndMatrixBehavior() throws IOException {
        CifFile textCifFile = CifIO.readFromInputStream(TestHelper.getInputStream("cif/1acj.cif"));
        testVectorAndMatrixBehavior(textCifFile);

        CifFile binaryCifFile = CifIO.readFromInputStream(TestHelper.getInputStream("bcif/1acj.bcif"));
        testVectorAndMatrixBehavior(binaryCifFile);
    }

    private void testVectorAndMatrixBehavior(CifFile cifFile) {
        // TODO update
        // TODO matrix/vector/enum support
//        AtomSites atomSites = cifFile.getBlocks().get(0).getAtomSites();
//
//        assertDefined(atomSites.getFractTransfMatrix11());
//        assertEquals(0.008795, atomSites.getFractTransfMatrix11().get(0), TestHelper.ERROR_MARGIN);
//        assertDefined(atomSites.getFractTransfMatrix12());
//        assertEquals(0.005078, atomSites.getFractTransfMatrix12().get(0), TestHelper.ERROR_MARGIN);
//        assertDefined(atomSites.getFractTransfMatrix13());
//        assertEquals(0.0, atomSites.getFractTransfMatrix13().get(0), TestHelper.ERROR_MARGIN);
//        assertDefined(atomSites.getFractTransfMatrix21());
//        assertEquals(0.0, atomSites.getFractTransfMatrix21().get(0), TestHelper.ERROR_MARGIN);
//        assertDefined(atomSites.getFractTransfMatrix22());
//        assertEquals(0.010156, atomSites.getFractTransfMatrix22().get(0), TestHelper.ERROR_MARGIN);
//        assertDefined(atomSites.getFractTransfMatrix23());
//        assertEquals(0.0, atomSites.getFractTransfMatrix23().get(0), TestHelper.ERROR_MARGIN);
//        assertDefined(atomSites.getFractTransfMatrix31());
//        assertEquals(0.0, atomSites.getFractTransfMatrix31().get(0), TestHelper.ERROR_MARGIN);
//        assertDefined(atomSites.getFractTransfMatrix32());
//        assertEquals(0.0, atomSites.getFractTransfMatrix32().get(0), TestHelper.ERROR_MARGIN);
//        assertDefined(atomSites.getFractTransfMatrix33());
//        assertEquals(0.007241, atomSites.getFractTransfMatrix33().get(0), TestHelper.ERROR_MARGIN);
//
//        assertDefined(atomSites.getFractTransfVector1());
//        assertEquals(0.0, atomSites.getFractTransfVector1().get(0), TestHelper.ERROR_MARGIN);
//        assertDefined(atomSites.getFractTransfVector2());
//        assertEquals(0.0, atomSites.getFractTransfVector2().get(0), TestHelper.ERROR_MARGIN);
//        assertDefined(atomSites.getFractTransfVector3());
//        assertEquals(0.0, atomSites.getFractTransfVector3().get(0), TestHelper.ERROR_MARGIN);
    }

    private void assertDefined(Column column) {
        assertNotNull(column);
        assertTrue(column.isDefined());
        assertTrue(column.getRowCount() > 0);
    }

    @Test
    public void testUndefinedColumnBehavior() throws IOException {
        CifFile textCifFile = CifIO.readFromInputStream(TestHelper.getInputStream("cif/0red.cif"));
        testUndefinedColumnBehavior(textCifFile);

        CifFile binaryCifFile = CifIO.readFromInputStream(TestHelper.getInputStream("bcif/0red.bcif"));
        testUndefinedColumnBehavior(binaryCifFile);
    }

    private void testUndefinedColumnBehavior(CifFile cifFile) {
        MmCifBlock block = cifFile.getFirstBlock(StandardSchemas.MMCIF);
        assertNotNull("header is corrupted", block.getBlockHeader());

        assertTrue(block.getEntry().isDefined());

        String entryId = block.getEntry().getId().get(0);
        assertEquals("0RED", entryId);

        // atom site should be obtainable
        AtomSite atomSite = block.getAtomSite();
        // and return its name
        assertEquals("atom_site", atomSite.getCategoryName());
        // though not be present
        assertFalse(atomSite.isDefined());
        // report 0 rows
        assertEquals(0, atomSite.getRowCount());

        // columns still should be accessible
        FloatColumn cartnX = atomSite.getCartnX();
        assertEquals("Cartn_x", cartnX.getColumnName());
        assertEquals(0, cartnX.getRowCount());
        assertFalse(cartnX.isDefined());
    }

    @Test
    public void testNumberFormat() {
        String[] text = {"1.0", "2", "-1.567891234567"};
        String data = String.join("", text);
        int[] start = new int[] { 0, 3, 4 };
        int[] end = new int[] { 3, 4, data.length() };

        // coord columns print with 3 decimal digits
        FloatColumn cartnX = new DelegatingFloatColumn(new TextColumn("Cartn_x", text.length, data, start, end));
        FloatColumn cartnY = new DelegatingFloatColumn(new TextColumn("Cartn_y", text.length, data, start, end));
        FloatColumn cartnZ = new DelegatingFloatColumn(new TextColumn("Cartn_z", text.length, data, start, end));

        Stream.of(cartnX, cartnY, cartnZ).forEach(coordColumn -> {
            assertEquals("1.000", coordColumn.getStringData(0));
            assertEquals("2.000", coordColumn.getStringData(1));
            assertEquals("-1.568", coordColumn.getStringData(2));
        });

        // occupancy uses 2 decimal digits
        FloatColumn occupancy = new DelegatingFloatColumn(new TextColumn("occupancy", text.length, data, start, end));
        assertEquals("1.00", occupancy.getStringData(0));
        assertEquals("2.00", occupancy.getStringData(1));
        assertEquals("-1.57", occupancy.getStringData(2));

        // all other should fallback to default behavior
        FloatColumn bIsoOrEquiv = new DelegatingFloatColumn(new TextColumn("iso", text.length, data, start, end));
        // truncate float which perfectly round to integers
        assertEquals("1", bIsoOrEquiv.getStringData(0));
        assertEquals("2", bIsoOrEquiv.getStringData(1));
        // cut long numbers after 6 decimal places
        assertEquals("-1.567891", bIsoOrEquiv.getStringData(2));
    }

    @Test
    public void testUnknownFeatureText() throws IOException {
        // read from cif
        InputStream inputStream = TestHelper.getInputStream("cif/1acj.cif");
        CifFile text = CifIO.readFromInputStream(inputStream);

        // TODO update
//        Cell cell = text.getBlocks().get(0).getCell();
//
//        StrColumn pdbxUniqueAxis = cell.getPdbxUniqueAxis();
//
//        assertEquals(ValueKind.UNKNOWN, pdbxUniqueAxis.getValueKind(0));
//        assertEquals("", pdbxUniqueAxis.get(0));
    }

    @Test
    public void testNotPresentFeatureText() throws IOException {
        // read from cif
        InputStream inputStream = TestHelper.getInputStream("cif/1acj.cif");
        CifFile text = CifIO.readFromInputStream(inputStream);

        // TODO update
//        StrColumn labelAltId = text.getFirstBlock().getAtomSite().getLabelAltId();
//
//        assertEquals(ValueKind.NOT_PRESENT, labelAltId.getValueKind(0));
//        assertEquals("", labelAltId.get(0));
    }

    @Test
    public void testUnknownFeatureBinary() throws IOException {
        // read from cif
        InputStream inputStream = TestHelper.getInputStream("bcif/1acj.bcif");
        CifFile text = CifIO.readFromInputStream(inputStream);

        // TODO update
//        Cell cell = text.getFirstBlock().getCell();
//
//        StrColumn pdbxUniqueAxis = cell.getPdbxUniqueAxis();
//
//        assertEquals(ValueKind.UNKNOWN, pdbxUniqueAxis.getValueKind(0));
//        assertEquals("", pdbxUniqueAxis.get(0));
    }

    @Test
    public void testNotPresentFeatureBinary() throws IOException {
        // read from cif
        InputStream inputStream = TestHelper.getInputStream("bcif/1acj.bcif");
        CifFile text = CifIO.readFromInputStream(inputStream);

        // TODO update
//        StrColumn labelAltId = text.getFirstBlock().getAtomSite().getLabelAltId();
//
//        assertEquals(ValueKind.NOT_PRESENT, labelAltId.getValueKind(0));
//        assertEquals("", labelAltId.get(0));
    }

    @Test
    public void roundTripViaBinary() throws IOException {
        // load cif file, encode as bcif, write as cif again - should roughly match original (number formatting will change)
        for (String id : TEST_CASES.keySet()) {
            roundTripViaBinary(id);
        }
    }

    private void roundTripViaBinary(String testCase) throws IOException {
        String originalContent = new String(TestHelper.getBytes("snapshot/" + testCase + ".cif"));
        CifFile originalFile = CifIO.readFromInputStream(TestHelper.getInputStream("snapshot/" + testCase + ".cif"));

        byte[] bcifBytes = CifIO.writeBinary(originalFile);

        CifFile bcifFile = CifIO.readFromInputStream(new ByteArrayInputStream(bcifBytes));

        byte[] copyBytes = CifIO.writeText(bcifFile);
        String copyContent = new String(copyBytes);

        assertEqualsLoosely(originalContent, copyContent);
    }

    @Test
    public void roundTripViaText() throws IOException {
        int match = 0;
        for (String id : TEST_CASES.keySet()) {
            if (roundTripViaText(id)) {
                match++;
            }
        }
        System.out.println(match);
        assertTrue("unexpected differences in files", match >= 4);
    }

    private boolean roundTripViaText(String testCase) throws IOException {
        byte[] original = TestHelper.getBytes("snapshot/" + testCase + ".bcif");
        CifFile originalFile = CifIO.readFromInputStream(TestHelper.getInputStream("snapshot/" + testCase + ".bcif"));

        byte[] cifBytes = CifIO.writeText(originalFile);
        CifFile cifFile = CifIO.readFromInputStream(new ByteArrayInputStream(cifBytes));

        byte[] output = CifIO.writeBinary(cifFile);

        // TODO these should match in all cases
        return Arrays.equals(original, output);
//        assertEquals(new String(original, StandardCharsets.UTF_8), new String(output, StandardCharsets.UTF_8));
//        assertArrayEquals("binary write output does not match snapshot of output for " + testCase +
//                " - did the implementation change? if so, update snapshot files in snapshot/", original, output);
    }

    @Test
    public void readCifWriteBcif() throws IOException {
        int match = 0;
        for (String id : TEST_CASES.keySet()) {
            if (readCifWriteBcif(id)) {
                match++;
            }
        }
        assertTrue("unexpected differences in files", match >= 4);
    }

    private boolean readCifWriteBcif(String testCase) throws IOException {
        byte[] original = TestHelper.getBytes("snapshot/" + testCase + ".bcif");
        CifFile originalFile = CifIO.readFromInputStream(TestHelper.getInputStream("snapshot/" + testCase + ".cif"));

        byte[] output = CifIO.writeBinary(originalFile);

        // TODO these should match in all cases
        return Arrays.equals(original, output);
//        assertEquals(new String(original, StandardCharsets.UTF_8), new String(output, StandardCharsets.UTF_8));
//        assertArrayEquals("binary write output does not match snapshot of output for " + testCase +
//                " - did the implementation change? if so, update snapshot files in bcif/ciftools/", original, output);
    }

    @Test
    public void readBcifWriteCif() throws IOException {
        for (String id : TEST_CASES.keySet()) {
            readBcifWriteCif(id);
        }
    }

    private void readBcifWriteCif(String testCase) throws IOException {
        String originalContent = new String(TestHelper.getBytes("snapshot/" + testCase + ".cif"));
        CifFile originalFile = CifIO.readFromInputStream(TestHelper.getInputStream("snapshot/" + testCase + ".bcif"));

        String copyContent = new String(CifIO.writeText(originalFile));

        assertEquals(originalContent, copyContent);
    }
}
