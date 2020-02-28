package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the IHM_PREDICTED_CONTACT_RESTRAINT category records the
 * list of predicted contacts used in the integrative modeling experiment.
 * This has been adapted from the widely used CASP RR format
 * (http://www.predictioncenter.org/casp8/index.cgi?page=format#RR).
 * These contacts may be derived from various computational tools.
 * The software information can be provided in the SOFTWARE category.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class IhmPredictedContactRestraint extends DelegatingCategory {
    public IhmPredictedContactRestraint(Category delegate) {
        super(delegate);
    }

    /**
     * A unique identifier for the predicted contact restraint.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * An identifier to group the predicted contacts.
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
     * The entity identifier for the first monomer partner in the predicted contact.
     * This data item is a pointer to _entity_poly_seq.entity_id in the ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getEntityId1() {
        return delegate.getColumn("entity_id_1", DelegatingStrColumn::new);
    }

    /**
     * The entity identifier for the second monomer partner in the predicted contact.
     * This data item is a pointer to _entity_poly_seq.entity_id in the ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getEntityId2() {
        return delegate.getColumn("entity_id_2", DelegatingStrColumn::new);
    }

    /**
     * An asym/strand identifier for the first monomer partner in the predicted contact.
     * This data item is a pointer to _struct_asym.id in the
     * STRUCT_ASYM category.
     * @return StrColumn
     */
    public StrColumn getAsymId1() {
        return delegate.getColumn("asym_id_1", DelegatingStrColumn::new);
    }

    /**
     * An asym/strand identifier for the second monomer partner in the predicted contact.
     * This data item is a pointer to _struct_asym.id in the
     * STRUCT_ASYM category.
     * @return StrColumn
     */
    public StrColumn getAsymId2() {
        return delegate.getColumn("asym_id_2", DelegatingStrColumn::new);
    }

    /**
     * The component identifier for the first monomer partner in the predicted contact.
     * This data item is a pointer to _entity_poly_seq.mon_id in the ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getCompId1() {
        return delegate.getColumn("comp_id_1", DelegatingStrColumn::new);
    }

    /**
     * The component identifier for the second monomer partner in the predicted contact.
     * This data item is a pointer to _entity_poly_seq.mon_id in the ENTITY_POLY_SEQ category.
     * @return StrColumn
     */
    public StrColumn getCompId2() {
        return delegate.getColumn("comp_id_2", DelegatingStrColumn::new);
    }

    /**
     * The sequence index for the first monomer partner in the predicted contact.
     * This data item is a pointer to _entity_poly_seq.num in the ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getSeqId1() {
        return delegate.getColumn("seq_id_1", DelegatingIntColumn::new);
    }

    /**
     * The sequence index for the second monomer partner in the predicted contact.
     * This data item is a pointer to _entity_poly_seq.num in the ENTITY_POLY_SEQ category.
     * @return IntColumn
     */
    public IntColumn getSeqId2() {
        return delegate.getColumn("seq_id_2", DelegatingIntColumn::new);
    }

    /**
     * The atom id of the first partner in the predicted contact.
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return StrColumn
     */
    public StrColumn getAtomId1() {
        return delegate.getColumn("atom_id_1", DelegatingStrColumn::new);
    }

    /**
     * The atom id of the second partner in the predicted contact.
     * This data item is a pointer to _chem_comp_atom.atom_id in the
     * CHEM_COMP_ATOM category.
     * @return StrColumn
     */
    public StrColumn getAtomId2() {
        return delegate.getColumn("atom_id_2", DelegatingStrColumn::new);
    }

    /**
     * The lower limit to the distance threshold applied to this predicted contact restraint
     * in the integrative modeling task.
     * @return FloatColumn
     */
    public FloatColumn getDistanceLowerLimit() {
        return delegate.getColumn("distance_lower_limit", DelegatingFloatColumn::new);
    }

    /**
     * The upper limit to the distance threshold applied to this predicted contact restraint
     * in the integrative modeling task.
     * @return FloatColumn
     */
    public FloatColumn getDistanceUpperLimit() {
        return delegate.getColumn("distance_upper_limit", DelegatingFloatColumn::new);
    }

    /**
     * The real number that indicates the probability that the predicted distance restraint
     * is correct. This number should fall between 0.0 and 1.0.
     * @return FloatColumn
     */
    public FloatColumn getProbability() {
        return delegate.getColumn("probability", DelegatingFloatColumn::new);
    }

    /**
     * The type of distance restraint applied.
     * @return StrColumn
     */
    public StrColumn getRestraintType() {
        return delegate.getColumn("restraint_type", DelegatingStrColumn::new);
    }

    /**
     * The granularity of the predicted contact as applied to the multi-scale model.
     * @return StrColumn
     */
    public StrColumn getModelGranularity() {
        return delegate.getColumn("model_granularity", DelegatingStrColumn::new);
    }

    /**
     * Identifier to the predicted contacts dataset.
     * This data item is a pointer to the _ihm_dataset_list.id in the
     * IHM_DATASET_LIST category.
     * @return IntColumn
     */
    public IntColumn getDatasetListId() {
        return delegate.getColumn("dataset_list_id", DelegatingIntColumn::new);
    }

    /**
     * Identifier to the software used to obtain the predicted contacts dataset.
     * This data item is a pointer to the _software.pdbx_ordinal in the
     * SOFTWARE category.
     * @return IntColumn
     */
    public IntColumn getSoftwareId() {
        return delegate.getColumn("software_id", DelegatingIntColumn::new);
    }
}