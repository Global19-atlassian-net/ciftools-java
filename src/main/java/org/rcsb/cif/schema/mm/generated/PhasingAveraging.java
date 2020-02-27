package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the PHASING_AVERAGING category record details
 * about the phasing of the structure where methods involving
 * averaging of multiple observations of the molecule in the
 * asymmetric unit are involved.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class PhasingAveraging extends BaseCategory {
    public PhasingAveraging(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PhasingAveraging(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PhasingAveraging(String name) {
        super(name);
    }

    /**
     * A description of special aspects of the averaging process.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("details", StrColumn::new) :
                getBinaryColumn("details"));
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
     * A description of the phase-averaging phasing method used to
     * phase this structure.
     * 
     * Note that this is not the computer program used, which is
     * described in the SOFTWARE category, but rather the method
     * itself.
     * 
     * This data item should be used to describe significant
     * methodological options used within the phase-averaging program.
     * @return StrColumn
     */
    public StrColumn getMethod() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("method", StrColumn::new) :
                getBinaryColumn("method"));
    }
}
