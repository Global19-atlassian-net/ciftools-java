package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_ENTITY_POLY_COMP_LINK_LIST category enumerate the
 * the linkages between components within the polymer entity.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxEntityPolyCompLinkList extends DelegatingCategory {
    public PdbxEntityPolyCompLinkList(Category delegate) {
        super(delegate);
    }

    /**
     * The value of _pdbx_entity_poly_comp_link_list.link_id uniquely identifies
     * linkages within the branched entity.
     * @return IntColumn
     */
    public IntColumn getLinkId() {
        return delegate.getColumn("link_id", DelegatingIntColumn::new);
    }

    /**
     * A description of special aspects of this linkage.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The entity id for this branched entity.
     * 
     * This data item is a pointer to _entity_poly_seq.entity_id
     * in the ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getEntityId() {
        return delegate.getColumn("entity_id", DelegatingStrColumn::new);
    }

    /**
     * The component number for the first component making the linkage.
     * 
     * This data item is a pointer to _entity_poly_seq.num
     * in the ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getEntityCompNum1() {
        return delegate.getColumn("entity_comp_num_1", DelegatingIntColumn::new);
    }

    /**
     * The component number for the second component making the linkage.
     * 
     * This data item is a pointer to _entity_poly_seq.num
     * in the ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getEntityCompNum2() {
        return delegate.getColumn("entity_comp_num_2", DelegatingIntColumn::new);
    }

    /**
     * The component identifier for the first component making the linkage.
     * 
     * This data item is a pointer to _entity_poly_seq.mon_id
     * in the ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getCompId1() {
        return delegate.getColumn("comp_id_1", DelegatingStrColumn::new);
    }

    /**
     * The component identifier for the second component making the linkage.
     * 
     * This data item is a pointer to _entity_poly_seq.mon_id
     * in the ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getCompId2() {
        return delegate.getColumn("comp_id_2", DelegatingStrColumn::new);
    }

    /**
     * The atom identifier/name for the first atom making the linkage.
     * @return StrColumn
     */
    public StrColumn getAtomId1() {
        return delegate.getColumn("atom_id_1", DelegatingStrColumn::new);
    }

    /**
     * The leaving atom identifier/name bonded to the first atom making the linkage.
     * @return StrColumn
     */
    public StrColumn getLeavingAtomId1() {
        return delegate.getColumn("leaving_atom_id_1", DelegatingStrColumn::new);
    }

    /**
     * The chiral configuration of the first atom making the linkage.
     * @return StrColumn
     */
    public StrColumn getAtomStereoConfig1() {
        return delegate.getColumn("atom_stereo_config_1", DelegatingStrColumn::new);
    }

    /**
     * The atom identifier/name for the second atom making the linkage.
     * @return StrColumn
     */
    public StrColumn getAtomId2() {
        return delegate.getColumn("atom_id_2", DelegatingStrColumn::new);
    }

    /**
     * The leaving atom identifier/name bonded to the second atom making the linkage.
     * @return StrColumn
     */
    public StrColumn getLeavingAtomId2() {
        return delegate.getColumn("leaving_atom_id_2", DelegatingStrColumn::new);
    }

    /**
     * The chiral configuration of the second atom making the linkage.
     * @return StrColumn
     */
    public StrColumn getAtomStereoConfig2() {
        return delegate.getColumn("atom_stereo_config_2", DelegatingStrColumn::new);
    }

    /**
     * The bond order target for the chemical linkage.
     * @return StrColumn
     */
    public StrColumn getValueOrder() {
        return delegate.getColumn("value_order", DelegatingStrColumn::new);
    }
}