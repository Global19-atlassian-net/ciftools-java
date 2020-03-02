package org.rcsb.cif.schema.generated.core;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 * Category of items describing citation editor(s) details.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class CitationEditor extends DelegatingCategory.DelegatingCifCoreCategory {
    private static final String NAME = "citation_editor";

    public CitationEditor(CifCoreBlock parentBlock) {
        super(NAME, parentBlock);
    }

    /**
     * 
     * Code identifier in the CITATION list. The value must match an
     * identifier specified by _citation.id in the CITATION list.
     * @return StrColumn
     */
    public StrColumn getCitationId() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_citation_id"));
    }

    /**
     * 
     * Value is a unique key to a set of CITATION_EDITOR items
     * in a looped list.
     * @return StrColumn
     */
    public StrColumn getId() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_id"));
    }

    /**
     * 
     * Name of citation editor; relevant for book chapters.
     * The family name(s), followed by a comma and including any
     * dynastic components, precedes the first name(s) or initial(s).
     * @return StrColumn
     */
    public StrColumn getName() {
        return new DelegatingStrColumn(parentBlock.getColumn(NAME + "_name"));
    }

    /**
     * 
     * This data item defines the order of the editor's name in the
     * list of editors of a citation.
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return new DelegatingIntColumn(parentBlock.getColumn(NAME + "_ordinal"));
    }
}
