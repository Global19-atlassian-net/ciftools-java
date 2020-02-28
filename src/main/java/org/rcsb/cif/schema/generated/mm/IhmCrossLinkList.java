package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_CROSS_LINK_LIST category records the
 * list of spatial restraints derived from chemical crosslinking
 * experiment.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmCrossLinkList extends DelegatingCategory {
    public IhmCrossLinkList(Category delegate) {
        super(delegate);
    }

    /**
     * A unique identifier for the cross link restraint.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * An identifier for a set of ambiguous crosslink restraints.
     * Handles experimental uncertainties in the identities of
     * crosslinked residues.
     * @return IntColumn
     */
    public IntColumn getGroupId() {
        return delegate.getColumn("group_id", DelegatingIntColumn::new);
    }

    /**
     * A text description of molecular entity 1.
     * @return StrColumn
     */
    public StrColumn getEntityDescription1() {
        return delegate.getColumn("entity_description_1", DelegatingStrColumn::new);
    }

    /**
     * A text description of molecular entity 2.
     * @return StrColumn
     */
    public StrColumn getEntityDescription2() {
        return delegate.getColumn("entity_description_2", DelegatingStrColumn::new);
    }

    /**
     * The entity identifier for the first monomer partner in the cross link
     * This data item is a pointer to _entity_poly_seq.entity_id in the ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getEntityId1() {
        return delegate.getColumn("entity_id_1", DelegatingStrColumn::new);
    }

    /**
     * The entity identifier for the second monomer partner in the cross link
     * 
     * This data item is a pointer to _entity_poly_seq.entity_id in the ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getEntityId2() {
        return delegate.getColumn("entity_id_2", DelegatingStrColumn::new);
    }

    /**
     * The component identifier for the first monomer partner in the cross link.
     * 
     * This data item is a pointer to _entity_poly_seq.mon_id in the ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getCompId1() {
        return delegate.getColumn("comp_id_1", DelegatingStrColumn::new);
    }

    /**
     * The component identifier for the second monomer partner in the cross link.
     * 
     * This data item is a pointer to _entity_poly_seq.mon_id in the ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getCompId2() {
        return delegate.getColumn("comp_id_2", DelegatingStrColumn::new);
    }

    /**
     * The sequence index for the first monomer partner in the cross link.
     * 
     * This data item is a pointer to _entity_poly_seq.num in the ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getSeqId1() {
        return delegate.getColumn("seq_id_1", DelegatingIntColumn::new);
    }

    /**
     * The sequence index for the second monomer partner in the cross link.
     * 
     * This data item is a pointer to _entity_poly_seq.num in the ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getSeqId2() {
        return delegate.getColumn("seq_id_2", DelegatingIntColumn::new);
    }

    /**
     * The type of crosslinker used.
     * @return StrColumn
     */
    public StrColumn getLinkerType() {
        return delegate.getColumn("linker_type", DelegatingStrColumn::new);
    }

    /**
     * Identifier to the crosslinking dataset.
     * This data item is a pointer to the _ihm_dataset_list.id in the
     * IHM_DATASET_LIST category.
     * @return IntColumn
     */
    public IntColumn getDatasetListId() {
        return delegate.getColumn("dataset_list_id", DelegatingIntColumn::new);
    }
}