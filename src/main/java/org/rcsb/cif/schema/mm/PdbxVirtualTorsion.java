package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_VIRTUAL_TORSION category record details about
 * virtual torsion angles, as calculated from the contents of the ATOM,
 * CELL, and SYMMETRY data.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxVirtualTorsion extends DelegatingCategory {
    public PdbxVirtualTorsion(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "model_id":
                return getModelId();
            case "atom_site_id_1":
                return getAtomSiteId1();
            case "atom_site_label_alt_id_1":
                return getAtomSiteLabelAltId1();
            case "atom_site_label_atom_id_1":
                return getAtomSiteLabelAtomId1();
            case "atom_site_label_comp_id_1":
                return getAtomSiteLabelCompId1();
            case "atom_site_label_seq_id_1":
                return getAtomSiteLabelSeqId1();
            case "atom_site_label_asym_id_1":
                return getAtomSiteLabelAsymId1();
            case "atom_site_id_2":
                return getAtomSiteId2();
            case "atom_site_label_alt_id_2":
                return getAtomSiteLabelAltId2();
            case "atom_site_label_atom_id_2":
                return getAtomSiteLabelAtomId2();
            case "atom_site_label_comp_id_2":
                return getAtomSiteLabelCompId2();
            case "atom_site_label_seq_id_2":
                return getAtomSiteLabelSeqId2();
            case "atom_site_label_asym_id_2":
                return getAtomSiteLabelAsymId2();
            case "atom_site_id_3":
                return getAtomSiteId3();
            case "atom_site_label_alt_id_3":
                return getAtomSiteLabelAltId3();
            case "atom_site_label_atom_id_3":
                return getAtomSiteLabelAtomId3();
            case "atom_site_label_comp_id_3":
                return getAtomSiteLabelCompId3();
            case "atom_site_label_seq_id_3":
                return getAtomSiteLabelSeqId3();
            case "atom_site_label_asym_id_3":
                return getAtomSiteLabelAsymId3();
            case "atom_site_id_4":
                return getAtomSiteId4();
            case "atom_site_label_alt_id_4":
                return getAtomSiteLabelAltId4();
            case "atom_site_label_atom_id_4":
                return getAtomSiteLabelAtomId4();
            case "atom_site_label_comp_id_4":
                return getAtomSiteLabelCompId4();
            case "atom_site_label_seq_id_4":
                return getAtomSiteLabelSeqId4();
            case "atom_site_label_asym_id_4":
                return getAtomSiteLabelAsymId4();
            case "atom_site_auth_atom_id_1":
                return getAtomSiteAuthAtomId1();
            case "atom_site_auth_asym_id_1":
                return getAtomSiteAuthAsymId1();
            case "atom_site_auth_comp_id_1":
                return getAtomSiteAuthCompId1();
            case "atom_site_auth_seq_id_1":
                return getAtomSiteAuthSeqId1();
            case "atom_site_auth_atom_id_2":
                return getAtomSiteAuthAtomId2();
            case "atom_site_auth_asym_id_2":
                return getAtomSiteAuthAsymId2();
            case "atom_site_auth_comp_id_2":
                return getAtomSiteAuthCompId2();
            case "atom_site_auth_seq_id_2":
                return getAtomSiteAuthSeqId2();
            case "atom_site_auth_atom_id_3":
                return getAtomSiteAuthAtomId3();
            case "atom_site_auth_asym_id_3":
                return getAtomSiteAuthAsymId3();
            case "atom_site_auth_comp_id_3":
                return getAtomSiteAuthCompId3();
            case "atom_site_auth_seq_id_3":
                return getAtomSiteAuthSeqId3();
            case "atom_site_auth_atom_id_4":
                return getAtomSiteAuthAtomId4();
            case "atom_site_auth_asym_id_4":
                return getAtomSiteAuthAsymId4();
            case "atom_site_auth_comp_id_4":
                return getAtomSiteAuthCompId4();
            case "atom_site_auth_seq_id_4":
                return getAtomSiteAuthSeqId4();
            case "site_symmetry_1":
                return getSiteSymmetry1();
            case "site_symmetry_2":
                return getSiteSymmetry2();
            case "site_symmetry_3":
                return getSiteSymmetry3();
            case "site_symmetry_4":
                return getSiteSymmetry4();
            case "value":
                return getValue();
            case "value_esd":
                return getValueEsd();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The model number for the given angle
     * @return IntColumn
     */
    public IntColumn getModelId() {
        return delegate.getColumn("model_id", DelegatingIntColumn::new);
    }

    /**
     * The identifier of the first of the four atom sites that define
     * the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.id in the ATOM_SITE
     * category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteId1() {
        return delegate.getColumn("atom_site_id_1", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the first of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelAltId1() {
        return delegate.getColumn("atom_site_label_alt_id_1", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the first of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelAtomId1() {
        return delegate.getColumn("atom_site_label_atom_id_1", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the first of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelCompId1() {
        return delegate.getColumn("atom_site_label_comp_id_1", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the first of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getAtomSiteLabelSeqId1() {
        return delegate.getColumn("atom_site_label_seq_id_1", DelegatingIntColumn::new);
    }

    /**
     * An optional identifier of the first of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelAsymId1() {
        return delegate.getColumn("atom_site_label_asym_id_1", DelegatingStrColumn::new);
    }

    /**
     * The identifier of the second of the four atom sites that define
     * the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.id in the ATOM_SITE
     * category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteId2() {
        return delegate.getColumn("atom_site_id_2", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the second of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelAltId2() {
        return delegate.getColumn("atom_site_label_alt_id_2", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the second of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelAtomId2() {
        return delegate.getColumn("atom_site_label_atom_id_2", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the second of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelCompId2() {
        return delegate.getColumn("atom_site_label_comp_id_2", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the second of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getAtomSiteLabelSeqId2() {
        return delegate.getColumn("atom_site_label_seq_id_2", DelegatingIntColumn::new);
    }

    /**
     * An optional identifier of the second of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelAsymId2() {
        return delegate.getColumn("atom_site_label_asym_id_2", DelegatingStrColumn::new);
    }

    /**
     * The identifier of the third of the four atom sites that define
     * the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.id in the ATOM_SITE
     * category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteId3() {
        return delegate.getColumn("atom_site_id_3", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the third of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelAltId3() {
        return delegate.getColumn("atom_site_label_alt_id_3", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the third of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelAtomId3() {
        return delegate.getColumn("atom_site_label_atom_id_3", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the third of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelCompId3() {
        return delegate.getColumn("atom_site_label_comp_id_3", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the third of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getAtomSiteLabelSeqId3() {
        return delegate.getColumn("atom_site_label_seq_id_3", DelegatingIntColumn::new);
    }

    /**
     * An optional identifier of the third of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelAsymId3() {
        return delegate.getColumn("atom_site_label_asym_id_3", DelegatingStrColumn::new);
    }

    /**
     * The identifier of the fourth of the four atom sites that define
     * the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.id in the ATOM_SITE
     * category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteId4() {
        return delegate.getColumn("atom_site_id_4", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the fourth of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelAltId4() {
        return delegate.getColumn("atom_site_label_alt_id_4", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the fourth of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.label_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelAtomId4() {
        return delegate.getColumn("atom_site_label_atom_id_4", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the fourth of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.label_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelCompId4() {
        return delegate.getColumn("atom_site_label_comp_id_4", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the fourth of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.label_seq_id in the
     * ATOM_SITE category.
     * @return IntColumn
     */
    public IntColumn getAtomSiteLabelSeqId4() {
        return delegate.getColumn("atom_site_label_seq_id_4", DelegatingIntColumn::new);
    }

    /**
     * An optional identifier of the fourth of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.label_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteLabelAsymId4() {
        return delegate.getColumn("atom_site_label_asym_id_4", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the first of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthAtomId1() {
        return delegate.getColumn("atom_site_auth_atom_id_1", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the first of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthAsymId1() {
        return delegate.getColumn("atom_site_auth_asym_id_1", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the first of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthCompId1() {
        return delegate.getColumn("atom_site_auth_comp_id_1", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the first of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthSeqId1() {
        return delegate.getColumn("atom_site_auth_seq_id_1", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the second of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthAtomId2() {
        return delegate.getColumn("atom_site_auth_atom_id_2", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the second of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthAsymId2() {
        return delegate.getColumn("atom_site_auth_asym_id_2", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the second of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthCompId2() {
        return delegate.getColumn("atom_site_auth_comp_id_2", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the second of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthSeqId2() {
        return delegate.getColumn("atom_site_auth_seq_id_2", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the third of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthAtomId3() {
        return delegate.getColumn("atom_site_auth_atom_id_3", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the third of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthAsymId3() {
        return delegate.getColumn("atom_site_auth_asym_id_3", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the third of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthCompId3() {
        return delegate.getColumn("atom_site_auth_comp_id_3", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the third of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthSeqId3() {
        return delegate.getColumn("atom_site_auth_seq_id_3", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the fourth of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthAtomId4() {
        return delegate.getColumn("atom_site_auth_atom_id_4", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the fourth of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthAsymId4() {
        return delegate.getColumn("atom_site_auth_asym_id_4", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the fourth of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthCompId4() {
        return delegate.getColumn("atom_site_auth_comp_id_4", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the fourth of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAtomSiteAuthSeqId4() {
        return delegate.getColumn("atom_site_auth_seq_id_4", DelegatingStrColumn::new);
    }

    /**
     * The symmetry code of the first of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * @return StrColumn
     */
    public StrColumn getSiteSymmetry1() {
        return delegate.getColumn("site_symmetry_1", DelegatingStrColumn::new);
    }

    /**
     * The symmetry code of the second of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * @return StrColumn
     */
    public StrColumn getSiteSymmetry2() {
        return delegate.getColumn("site_symmetry_2", DelegatingStrColumn::new);
    }

    /**
     * The symmetry code of the third of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * @return StrColumn
     */
    public StrColumn getSiteSymmetry3() {
        return delegate.getColumn("site_symmetry_3", DelegatingStrColumn::new);
    }

    /**
     * The symmetry code of the fourth of the four atom sites that
     * define the torsion angle specified by _pdbx_virtual_torsion.value.
     * @return StrColumn
     */
    public StrColumn getSiteSymmetry4() {
        return delegate.getColumn("site_symmetry_4", DelegatingStrColumn::new);
    }

    /**
     * The value of the torsion angle in degrees.
     * @return FloatColumn
     */
    public FloatColumn getValue() {
        return delegate.getColumn("value", DelegatingFloatColumn::new);
    }

    /**
     * The estimated standard deviation of _pdbx_virtual_torsion.value.
     * @return FloatColumn
     */
    public FloatColumn getValueEsd() {
        return delegate.getColumn("value_esd", DelegatingFloatColumn::new);
    }

}