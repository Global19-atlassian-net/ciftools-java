package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_STRUCT_ASSEMBLY_DETAILS category provides
 * additional details regarding the structure assembly.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmStructAssemblyDetails extends DelegatingCategory {
    public IhmStructAssemblyDetails(Category delegate) {
        super(delegate);
    }

    /**
     * A unique identifier for the structural assembly.
     * @return IntColumn
     */
    public IntColumn getAssemblyId() {
        return delegate.getColumn("assembly_id", DelegatingIntColumn::new);
    }

    /**
     * A name for the structural assembly.
     * @return StrColumn
     */
    public StrColumn getAssemblyName() {
        return delegate.getColumn("assembly_name", DelegatingStrColumn::new);
    }

    /**
     * Description of the structural assembly.
     * @return StrColumn
     */
    public StrColumn getAssemblyDescription() {
        return delegate.getColumn("assembly_description", DelegatingStrColumn::new);
    }
}