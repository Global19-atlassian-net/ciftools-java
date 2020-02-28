package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_AUDIT_SUPPORT category record details about
 * funding support for the entry.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxAuditSupport extends DelegatingCategory {
    public PdbxAuditSupport(Category delegate) {
        super(delegate);
    }

    /**
     * The name of the organization providing funding support for the
     * entry.
     * @return StrColumn
     */
    public StrColumn getFundingOrganization() {
        return delegate.getColumn("funding_organization", DelegatingStrColumn::new);
    }

    /**
     * The country providing the funding support for the entry.
     * @return StrColumn
     */
    public StrColumn getCountry() {
        return delegate.getColumn("country", DelegatingStrColumn::new);
    }

    /**
     * The grant number associated with this source of support.
     * @return StrColumn
     */
    public StrColumn getGrantNumber() {
        return delegate.getColumn("grant_number", DelegatingStrColumn::new);
    }

    /**
     * Additional details regarding the funding of this entry
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * A unique sequential integer identifier for each source of support for this entry.
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return delegate.getColumn("ordinal", DelegatingIntColumn::new);
    }
}