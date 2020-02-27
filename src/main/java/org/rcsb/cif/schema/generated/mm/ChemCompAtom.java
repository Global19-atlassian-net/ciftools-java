package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the CHEM_COMP_ATOM category record details about
 * the atoms in a chemical component. Specifying the atomic
 * coordinates for the components in this category is an
 * alternative to specifying the structure of the component
 * via bonds, angles, planes etc. in the appropriate
 * CHEM_COMP subcategories.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class ChemCompAtom extends DelegatingCategory {
    public ChemCompAtom(Category delegate) {
        super(delegate);
    }

    /**
     * An alternative identifier for the atom. This data item would be
     * used in cases where alternative nomenclatures exist for labelling
     * atoms in a group.
     * @return StrColumn
     */
    public StrColumn getAltAtomId() {
        return delegate.getColumn("alt_atom_id", DelegatingStrColumn::new);
    }

    /**
     * The value of _chem_comp_atom.atom_id must uniquely identify
     * each atom in each monomer in the CHEM_COMP_ATOM list.
     * 
     * The atom identifiers need not be unique over all atoms in the
     * data block; they need only be unique for each atom in a
     * component.
     * 
     * Note that this item need not be a number; it can be any unique
     * identifier.
     * @return StrColumn
     */
    public StrColumn getAtomId() {
        return delegate.getColumn("atom_id", DelegatingStrColumn::new);
    }

    /**
     * The net integer charge assigned to this atom. This is the
     * formal charge assignment normally found in chemical diagrams.
     * @return IntColumn
     */
    public IntColumn getCharge() {
        return delegate.getColumn("charge", DelegatingIntColumn::new);
    }

    /**
     * The x component of the coordinates for this atom in this
     * component specified as orthogonal angstroms. The choice of
     * reference axis frame for the coordinates is arbitrary.
     * 
     * The set of coordinates input for the entity here is intended to
     * correspond to the atomic model used to generate restraints for
     * structure refinement, not to atom sites in the ATOM_SITE
     * list.
     * @return FloatColumn
     */
    public FloatColumn getModelCartnX() {
        return delegate.getColumn("model_Cartn_x", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _chem_comp_atom.model_Cartn_x.
     * @return FloatColumn
     */
    public FloatColumn getModelCartnXEsd() {
        return delegate.getColumn("model_Cartn_x_esd", DelegatingFloatColumn::new);
    }

    /**
     * The y component of the coordinates for this atom in this
     * component specified as orthogonal angstroms. The choice of
     * reference axis frame for the coordinates is arbitrary.
     * 
     * The set of coordinates input for the entity here is intended to
     * correspond to the atomic model used to generate restraints for
     * structure refinement, not to atom sites in the ATOM_SITE
     * list.
     * @return FloatColumn
     */
    public FloatColumn getModelCartnY() {
        return delegate.getColumn("model_Cartn_y", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _chem_comp_atom.model_Cartn_y.
     * @return FloatColumn
     */
    public FloatColumn getModelCartnYEsd() {
        return delegate.getColumn("model_Cartn_y_esd", DelegatingFloatColumn::new);
    }

    /**
     * The z component of the coordinates for this atom in this
     * component specified as orthogonal angstroms. The choice of
     * reference axis frame for the coordinates is arbitrary.
     * 
     * The set of coordinates input for the entity here is intended to
     * correspond to the atomic model used to generate restraints for
     * structure refinement, not to atom sites in the ATOM_SITE
     * list.
     * @return FloatColumn
     */
    public FloatColumn getModelCartnZ() {
        return delegate.getColumn("model_Cartn_z", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _chem_comp_atom.model_Cartn_z.
     * @return FloatColumn
     */
    public FloatColumn getModelCartnZEsd() {
        return delegate.getColumn("model_Cartn_z_esd", DelegatingFloatColumn::new);
    }

    /**
     * This data item is a pointer to _chem_comp.id in the CHEM_COMP
     * category.
     * @return StrColumn
     */
    public StrColumn getCompId() {
        return delegate.getColumn("comp_id", DelegatingStrColumn::new);
    }

    /**
     * The partial charge assigned to this atom.
     * @return FloatColumn
     */
    public FloatColumn getPartialCharge() {
        return delegate.getColumn("partial_charge", DelegatingFloatColumn::new);
    }

    /**
     * This data item assigns the atom to a substructure of the
     * component, if appropriate.
     * @return StrColumn
     */
    public StrColumn getSubstructCode() {
        return delegate.getColumn("substruct_code", DelegatingStrColumn::new);
    }

    /**
     * The code used to identify the atom species representing
     * this atom type. Normally this code is the element
     * symbol.
     * @return StrColumn
     */
    public StrColumn getTypeSymbol() {
        return delegate.getColumn("type_symbol", DelegatingStrColumn::new);
    }

    /**
     * Atom name alignment offset in PDB atom field.
     * @return IntColumn
     */
    public IntColumn getPdbxAlign() {
        return delegate.getColumn("pdbx_align", DelegatingIntColumn::new);
    }

    /**
     * Ordinal index for the component atom list.
     * @return IntColumn
     */
    public IntColumn getPdbxOrdinal() {
        return delegate.getColumn("pdbx_ordinal", DelegatingIntColumn::new);
    }

    /**
     * The atom identifier in the subcomponent where a
     * larger component has been divided subcomponents.
     * @return StrColumn
     */
    public StrColumn getPdbxComponentAtomId() {
        return delegate.getColumn("pdbx_component_atom_id", DelegatingStrColumn::new);
    }

    /**
     * The component identifier for the subcomponent where a
     * larger component has been divided subcomponents.
     * @return StrColumn
     */
    public StrColumn getPdbxComponentCompId() {
        return delegate.getColumn("pdbx_component_comp_id", DelegatingStrColumn::new);
    }

    /**
     * An alternative identifier for the atom. This data item would be
     * used in cases where alternative nomenclatures exist for labelling
     * atoms in a group.
     * @return StrColumn
     */
    public StrColumn getPdbxAltAtomId() {
        return delegate.getColumn("pdbx_alt_atom_id", DelegatingStrColumn::new);
    }

    /**
     * An alternative identifier for the atom. This data item would be
     * used in cases where alternative nomenclatures exist for labelling
     * atoms in a group.
     * @return StrColumn
     */
    public StrColumn getPdbxAltCompId() {
        return delegate.getColumn("pdbx_alt_comp_id", DelegatingStrColumn::new);
    }

    /**
     * An alternative x component of the coordinates for this atom in this
     * component specified as orthogonal angstroms.
     * @return FloatColumn
     */
    public FloatColumn getPdbxModelCartnXIdeal() {
        return delegate.getColumn("pdbx_model_Cartn_x_ideal", DelegatingFloatColumn::new);
    }

    /**
     * An alternative y component of the coordinates for this atom in this
     * component specified as orthogonal angstroms.
     * @return FloatColumn
     */
    public FloatColumn getPdbxModelCartnYIdeal() {
        return delegate.getColumn("pdbx_model_Cartn_y_ideal", DelegatingFloatColumn::new);
    }

    /**
     * An alternative z component of the coordinates for this atom in this
     * component specified as orthogonal angstroms.
     * @return FloatColumn
     */
    public FloatColumn getPdbxModelCartnZIdeal() {
        return delegate.getColumn("pdbx_model_Cartn_z_ideal", DelegatingFloatColumn::new);
    }

    /**
     * The chiral configuration of the atom that is a chiral center.
     * @return StrColumn
     */
    public StrColumn getPdbxStereoConfig() {
        return delegate.getColumn("pdbx_stereo_config", DelegatingStrColumn::new);
    }

    /**
     * A flag indicating an aromatic atom.
     * @return StrColumn
     */
    public StrColumn getPdbxAromaticFlag() {
        return delegate.getColumn("pdbx_aromatic_flag", DelegatingStrColumn::new);
    }

    /**
     * A flag indicating a leaving atom.
     * @return StrColumn
     */
    public StrColumn getPdbxLeavingAtomFlag() {
        return delegate.getColumn("pdbx_leaving_atom_flag", DelegatingStrColumn::new);
    }

    /**
     * Preferred residue numbering in the BIRD definition.
     * @return IntColumn
     */
    public IntColumn getPdbxResidueNumbering() {
        return delegate.getColumn("pdbx_residue_numbering", DelegatingIntColumn::new);
    }

    /**
     * Is the atom in a polymer or non-polymer subcomponent in the BIRD definition.
     * @return StrColumn
     */
    public StrColumn getPdbxPolymerType() {
        return delegate.getColumn("pdbx_polymer_type", DelegatingStrColumn::new);
    }

    /**
     * A reference to _pdbx_reference_entity_list.ref_entity_id
     * @return StrColumn
     */
    public StrColumn getPdbxRefId() {
        return delegate.getColumn("pdbx_ref_id", DelegatingStrColumn::new);
    }

    /**
     * A reference to _pdbx_reference_entity_list.component_id
     * @return IntColumn
     */
    public IntColumn getPdbxComponentId() {
        return delegate.getColumn("pdbx_component_id", DelegatingIntColumn::new);
    }

    /**
     * A reference to entity identifier in data  category
     * pdbx_chem_comp_subcomponent_entity_list.
     * @return IntColumn
     */
    public IntColumn getPdbxComponentEntityId() {
        return delegate.getColumn("pdbx_component_entity_id", DelegatingIntColumn::new);
    }
}
