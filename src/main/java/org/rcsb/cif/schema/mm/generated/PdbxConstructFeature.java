package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PDBX_CONSTRUCT_FEATURE category may be used to
 * specify various properties of a nucleic acid sequence used during
 * protein production.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PdbxConstructFeature extends BaseCategory {
    public PdbxConstructFeature(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxConstructFeature(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxConstructFeature(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_construct_feature.id must uniquely
     * identify a record in the PDBX_CONSTRUCT_FEATURE list.
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return StrColumn
     */
    public StrColumn getId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("id", StrColumn::new) :
                getBinaryColumn("id"));
    }

    /**
     * The value of _pdbx_construct_feature.construct_id uniquely
     * identifies the construct with which the feature is
     * associated. This is a pointer to _pdbx_construct.id
     * This item may be a site dependent bar code.
     * @return StrColumn
     */
    public StrColumn getConstructId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("construct_id", StrColumn::new) :
                getBinaryColumn("construct_id"));
    }

    /**
     * The value of _pdbx_construct_feature.entry_id uniquely identifies
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
     * The sequence position at which the feature begins
     * @return IntColumn
     */
    public IntColumn getStartSeq() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("start_seq", IntColumn::new) :
                getBinaryColumn("start_seq"));
    }

    /**
     * The sequence position at which the feature ends
     * @return IntColumn
     */
    public IntColumn getEndSeq() {
        return (IntColumn) (isText ? textFields.computeIfAbsent("end_seq", IntColumn::new) :
                getBinaryColumn("end_seq"));
    }

    /**
     * The type of the feature
     * @return StrColumn
     */
    public StrColumn getType() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("type", StrColumn::new) :
                getBinaryColumn("type"));
    }

    /**
     * Details that describe the feature
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
    }
}
