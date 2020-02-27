package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_CONSTRUCT category specify a sequence of
 * nucleic acids or amino acids. It is a catch-all that may be used to
 * provide details of sequences known to be relevant to the project as well
 * as primers, plasmids, proteins and such like that are either used or
 * produced during the protein production process. Molecules described
 * here are not necessarily complete, so for instance it would be
 * possible to include either a complete plasmid or just its insert.
 * This category may be considered as an abbreviated form of _entity where
 * the molecules described are not required to appear in the final co-ordinates.
 * 
 * Note that the details provided here all pertain to a single entry as defined
 * at deposition. It is anticipated that _pdbx_construct.id would also be
 * composed of a sequence that is unique within a given site prefixed by a code
 * that identifies that site and would, therefore, be GLOBALLY unique. Thus
 * this category could also be used locally to store details about the different
 * constructs used during protein production without reference to the entry_id
 * (which only becomes a  meaningful concept during deposition).
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxConstruct extends BaseCategory {
    public PdbxConstruct(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxConstruct(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxConstruct(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_construct.entry_id uniquely identifies
     * a sample consisting of one or more proteins whose structure is
     * to be determined. This is a pointer to _entry.id. This item may
     * be a site dependent bar code.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entry_id", StrColumn::new) :
                getBinaryColumn("entry_id"));
    }

    /**
     * The value of _pdbx_construct.id must uniquely identify a record
     * in the PDBX_CONSTRUCT list and should be arranged so that it is
     * composed of a site-speicific prefix combined with a value that is
     * unique within a given site.Note that this item need not be a
     * number; it can be any unique identifier.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * _pdbx_construct.name  provides a placeholder for the local name
     * of the construct, for example the plasmid name if this category
     * is used to list plasmids.
     * @return StrColumn
     */
    public StrColumn getName() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("name", StrColumn::new) :
                getBinaryColumn("name"));
    }

    /**
     * _pdbx_construct.organisation describes the organisation in which
     * the _pdbx_construct.id is unique. This will normally be the lab
     * in which the constrcut originated. It is envisaged that this item
     * will permit a globally unique identifier to be constructed in cases
     * where this is not possible from the _pdbx_construct.id alone.
     * @return StrColumn
     */
    public StrColumn getOrganisation() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("organisation", StrColumn::new) :
                getBinaryColumn("organisation"));
    }

    /**
     * In cases where the construct IS found in the co-ordinates then this
     * item provides a  pointer to _entity.id in the ENTITY category for
     * the corresponding molecule.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("entity_id", StrColumn::new) :
                getBinaryColumn("entity_id"));
    }

    /**
     * In cases where the sequence has been determined by a robot this
     * data item provides a pointer to pdbx_robot_system.id in the
     * PDBX_ROBOT_SYSTEM category for the robot responsible
     * @return StrColumn
     */
    public StrColumn getRobotId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("robot_id", StrColumn::new) :
                getBinaryColumn("robot_id"));
    }

    /**
     * The date that the sequence was determined.
     * @return StrColumn
     */
    public StrColumn getDate() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("date", StrColumn::new) :
                getBinaryColumn("date"));
    }

    /**
     * Additional details about the construct that cannot be
     * represented in the category _pdbx_construct_feature.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }

    /**
     * The primary function of the construct. This should be considered
     * as a guideline only.
     * @return StrColumn
     */
    public StrColumn getClazz() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("class", StrColumn::new) :
                getBinaryColumn("class"));
    }

    /**
     * The type of nucleic acid sequence in the construct. Note that
     * to find all the DNA molecules it is necessary to search for
     * DNA + cDNA and for RNA, RNA + mRNA + tRNA.
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * sequence expressed as string of one-letter base codes or one
     * letter amino acid codes. Unusual residues may be represented
     * either using the appropriate one letter code wild cards or
     * by the three letter code in parentheses.
     * @return StrColumn
     */
    public StrColumn getSeq() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("seq", StrColumn::new) :
                getBinaryColumn("seq"));
    }
}
