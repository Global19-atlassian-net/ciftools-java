package org.rcsb.cif.model.pdbxmolecule;

import org.rcsb.cif.model.BaseCategory;
import org.rcsb.cif.model.Column;

import javax.annotation.Generated;
import java.util.Map;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxMolecule extends BaseCategory {
    public PdbxMolecule(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public PdbxMolecule(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public PdbxMolecule(String name) {
        super(name);
    }

    /**
     * The value of _pdbx_molecule.prd_id is the PDB accession code for this
     * reference molecule.
     * @return PrdId
     */
    public PrdId getPrdId() {
        return (PrdId) (isText ? textFields.computeIfAbsent("prd_id",
                PrdId::new) : getBinaryColumn("prd_id"));
    }

    /**
     * The value of _pdbx_molecule.instance_id is identifies a particular molecule
     * in the molecule list.
     * @return InstanceId
     */
    public InstanceId getInstanceId() {
        return (InstanceId) (isText ? textFields.computeIfAbsent("instance_id",
                InstanceId::new) : getBinaryColumn("instance_id"));
    }

    /**
     * A reference to _struct_asym.id in the STRUCT_ASYM category.
     * @return AsymId
     */
    public AsymId getAsymId() {
        return (AsymId) (isText ? textFields.computeIfAbsent("asym_id",
                AsymId::new) : getBinaryColumn("asym_id"));
    }
}