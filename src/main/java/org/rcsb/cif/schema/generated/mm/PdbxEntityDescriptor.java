package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_ENTITY_DESCRIPTOR category provide
 * string descriptors of entity chemical structure.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxEntityDescriptor extends DelegatingCategory {
    public PdbxEntityDescriptor(Category delegate) {
        super(delegate);
    }

    /**
     * This data item is a pointer to _entity_poly.entity_id in the ENTITY
     * category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * This data item contains the descriptor value for this
     * entity.
     * @return StrColumn
     */
    public StrColumn getDescriptor() {
        return delegate.getColumn("descriptor", DelegatingStrColumn::new);
    }

    /**
     * This data item contains the descriptor type.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * This data item contains the name of the program
     * or library used to compute the descriptor.
     * @return StrColumn
     */
    public StrColumn getProgram() {
        return delegate.getColumn("program", DelegatingStrColumn::new);
    }

    /**
     * This data item contains the version of the program
     * or library used to compute the descriptor.
     * @return StrColumn
     */
    public StrColumn getProgramVersion() {
        return delegate.getColumn("program_version", DelegatingStrColumn::new);
    }

    /**
     * Ordinal index for this category.
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return delegate.getColumn("ordinal", DelegatingIntColumn::new);
    }
}
