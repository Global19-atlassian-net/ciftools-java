package org.rcsb.cif.schema.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 * Category of data items that allow the authors of a manuscript to
 * submit for publication data names that should be added to the
 * standard request list employed by journal printing software.
 * Although these fields are primarily intended to identify CIF data
 * items that the author wishes to include in a published paper, they
 * can also be used to identify data names created so that non-CIF items
 * can be included in the publication. Note that *.item names MUST be
 * enclosed in single quotes.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PublManuscriptInclExtra extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "publ_manuscript_incl_extra";

    public PublManuscriptInclExtra(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * Yes/No flags whether the corresponding data item marked for inclusion
     * in a journal request list is a standard CIF definition or not.
     * @return StrColumn
     */
    public StrColumn getDefn() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("publ_manuscript_incl_extra_defn", "publ_manuscript_incl_extra_defn"));
    }

    /**
     * A short note indicating the reason why the author wishes the
     * corresponding data item marked for inclusion in the journal
     * request list to be published.
     * @return StrColumn
     */
    public StrColumn getInfo() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("publ_manuscript_incl_extra_info", "publ_manuscript_incl_extra_info"));
    }

    /**
     * The data name (i.e. Tag) of a specific data item included in the
     * manuscript which is not normally requested by the journal. The values
     * of this item are the extra data names (which MUST be enclosed
     * in single quotes) that will be added to the journal request list.
     * @return StrColumn
     */
    public StrColumn getItem() {
        return new DelegatingStrColumn(parentBlock.getAliasedColumn("publ_manuscript_incl_extra_item", "publ_manuscript_incl_extra_item"));
    }
}
