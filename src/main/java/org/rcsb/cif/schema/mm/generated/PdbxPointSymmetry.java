package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_POINT_SYMMETRY category record details about the
 * point symmetry group associated with this entry.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxPointSymmetry extends BaseCategory {
    public PdbxPointSymmetry(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxPointSymmetry(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxPointSymmetry(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The Schoenflies point symmetry symbol.
     * @return StrColumn
     */
    public StrColumn getSchoenfliesSymbol() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("Schoenflies_symbol", StrColumn::new) :
                getBinaryColumn("Schoenflies_symbol"));
    }

    /**
     * Rotational n-fold C and D point symmetry.
     * @return IntColumn
     */
    public IntColumn getCircularSymmetry() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("circular_symmetry", IntColumn::new) :
                getBinaryColumn("circular_symmetry"));
    }

    /**
     * The Hermann-Mauguin notation for this point symmetry group.
     * @return StrColumn
     */
    public StrColumn getH_MNotation() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("H-M_notation", StrColumn::new) :
                getBinaryColumn("H-M_notation"));
    }
}
