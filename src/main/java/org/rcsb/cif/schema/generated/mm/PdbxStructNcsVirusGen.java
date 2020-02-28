package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_STRUCT_NCS_VIRUS_GEN category record details
 * about the generation of virus structures from NCS matrix operators.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxStructNcsVirusGen extends DelegatingCategory {
    public PdbxStructNcsVirusGen(Category delegate) {
        super(delegate);
    }

    /**
     * Unique id for generator.
     * @return StrColumn
     */
    public StrColumn getId() {
        return delegate.getColumn("id", DelegatingStrColumn::new);
    }

    /**
     * Identifies the NCS operation (_struct_ncs_oper.id)
     * @return StrColumn
     */
    public StrColumn getOperId() {
        return delegate.getColumn("oper_id", DelegatingStrColumn::new);
    }

    /**
     * The NCS operation is applied to the component of
     * the asymmetric unit identified by this id.
     * @return StrColumn
     */
    public StrColumn getAsymId() {
        return delegate.getColumn("asym_id", DelegatingStrColumn::new);
    }

    /**
     * The NCS operation is applied to the chain identified
     * by this id.
     * @return StrColumn
     */
    public StrColumn getPdbChainId() {
        return delegate.getColumn("pdb_chain_id", DelegatingStrColumn::new);
    }
}