package org.rcsb.cif.schema.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the PDBX_VALIDATE_POLYMER_LINKAGE category list the
 * polymer linkages within the entry that are outside of typlical
 * covalent distances.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxValidatePolymerLinkage extends DelegatingCategory {
    public PdbxValidatePolymerLinkage(Category delegate) {
        super(delegate);
    }

    @Override
    protected Column createDelegate(String columnName, Column column) {
        switch (columnName) {
            case "id":
                return getId();
            case "PDB_model_num":
                return getPDBModelNum();
            case "auth_asym_id_1":
                return getAuthAsymId1();
            case "auth_atom_id_1":
                return getAuthAtomId1();
            case "auth_comp_id_1":
                return getAuthCompId1();
            case "auth_seq_id_1":
                return getAuthSeqId1();
            case "auth_atom_id_2":
                return getAuthAtomId2();
            case "auth_asym_id_2":
                return getAuthAsymId2();
            case "auth_comp_id_2":
                return getAuthCompId2();
            case "auth_seq_id_2":
                return getAuthSeqId2();
            case "PDB_ins_code_1":
                return getPDBInsCode1();
            case "PDB_ins_code_2":
                return getPDBInsCode2();
            case "label_alt_id_1":
                return getLabelAltId1();
            case "label_alt_id_2":
                return getLabelAltId2();
            case "dist":
                return getDist();
            default:
                return new DelegatingColumn(column);
        }
    }

    /**
     * The value of _pdbx_validate_polymer_linkage.id must uniquely identify
     * each item in the PDBX_VALIDATE_POLYMER_LINKAGE list.
     * 
     * This is an integer serial number.
     * @return IntColumn
     */
    public IntColumn getId() {
        return delegate.getColumn("id", DelegatingIntColumn::new);
    }

    /**
     * The model number for the given linkage
     * @return IntColumn
     */
    public IntColumn getPDBModelNum() {
        return delegate.getColumn("PDB_model_num", DelegatingIntColumn::new);
    }

    /**
     * Part of the identifier of the first of the two atom sites that
     * define the linkage.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId1() {
        return delegate.getColumn("auth_asym_id_1", DelegatingStrColumn::new);
    }

    /**
     * Part of the identifier of the first of the two atom sites that
     * define the linkage.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAtomId1() {
        return delegate.getColumn("auth_atom_id_1", DelegatingStrColumn::new);
    }

    /**
     * Part of the identifier of the first of the two atom sites that
     * define the linkage.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthCompId1() {
        return delegate.getColumn("auth_comp_id_1", DelegatingStrColumn::new);
    }

    /**
     * Part of the identifier of the first of the two atom sites that
     * define the linkage.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId1() {
        return delegate.getColumn("auth_seq_id_1", DelegatingStrColumn::new);
    }

    /**
     * Part of the identifier of the second of the two atom sites
     * that define the linkage.
     * 
     * This data item is a pointer to _atom_site.auth_atom_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAtomId2() {
        return delegate.getColumn("auth_atom_id_2", DelegatingStrColumn::new);
    }

    /**
     * Part of the identifier of the second of the two atom sites
     * that define the linkage.
     * 
     * This data item is a pointer to _atom_site.auth_asym_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthAsymId2() {
        return delegate.getColumn("auth_asym_id_2", DelegatingStrColumn::new);
    }

    /**
     * Part of the identifier of the second of the two atom sites
     * that define the linkage.
     * 
     * This data item is a pointer to _atom_site.auth_comp_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthCompId2() {
        return delegate.getColumn("auth_comp_id_2", DelegatingStrColumn::new);
    }

    /**
     * Part of the identifier of the second of the two atom sites
     * that define the linkage.
     * 
     * This data item is a pointer to _atom_site.auth_seq_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getAuthSeqId2() {
        return delegate.getColumn("auth_seq_id_2", DelegatingStrColumn::new);
    }

    /**
     * Optional identifier of the first of the two atom sites that
     * define the linkage.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPDBInsCode1() {
        return delegate.getColumn("PDB_ins_code_1", DelegatingStrColumn::new);
    }

    /**
     * Optional identifier of the second of the two atom sites that
     * define the linkage.
     * 
     * This data item is a pointer to _atom_site.pdbx_PDB_ins_code in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getPDBInsCode2() {
        return delegate.getColumn("PDB_ins_code_2", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the first of the two atoms that
     * define the linkage.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAltId1() {
        return delegate.getColumn("label_alt_id_1", DelegatingStrColumn::new);
    }

    /**
     * An optional identifier of the second of the two atoms that
     * define the linkage.
     * 
     * This data item is a pointer to _atom_site.label_alt_id in the
     * ATOM_SITE category.
     * @return StrColumn
     */
    public StrColumn getLabelAltId2() {
        return delegate.getColumn("label_alt_id_2", DelegatingStrColumn::new);
    }

    /**
     * The value of the polymer linkage for the two atoms defined.
     * @return FloatColumn
     */
    public FloatColumn getDist() {
        return delegate.getColumn("dist", DelegatingFloatColumn::new);
    }

}