package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_audit_revision_details category
 * record descriptions of changes associated with
 * PDBX_AUDIT_REVISION_HISTORY records.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxAuditRevisionDetails extends DelegatingCategory {
    public PdbxAuditRevisionDetails(Category delegate) {
        super(delegate);
    }

    /**
     * A unique identifier for the pdbx_audit_revision_details record.
     * @return IntColumn
     */
    public IntColumn getOrdinal() {
        return delegate.getColumn("ordinal", DelegatingIntColumn::new);
    }

    /**
     * A pointer to  _pdbx_audit_revision_history.ordinal
     * @return IntColumn
     */
    public IntColumn getRevisionOrdinal() {
        return delegate.getColumn("revision_ordinal", DelegatingIntColumn::new);
    }

    /**
     * The type of file that the pdbx_audit_revision_history record refers to.
     * @return StrColumn
     */
    public StrColumn getDataContentType() {
        return delegate.getColumn("data_content_type", DelegatingStrColumn::new);
    }

    /**
     * The provider of the revision.
     * @return StrColumn
     */
    public StrColumn getProvider() {
        return delegate.getColumn("provider", DelegatingStrColumn::new);
    }

    /**
     * A type classification of the revision
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * Additional details describing the revision.
     * @return StrColumn
     */
    public StrColumn getDescription() {
        return delegate.getColumn("description", DelegatingStrColumn::new);
    }
}