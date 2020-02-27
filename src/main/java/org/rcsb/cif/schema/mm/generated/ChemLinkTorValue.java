package org.rcsb.cif.schema.mm.generated;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;
import java.util.Map;

/**
 * Data items in the CHEM_LINK_TOR_VALUE category record details
 * about the target values for the torsion angles enumerated in the
 * CHEM_LINK_TOR list. Target values may be specified as angles
 * in degrees, as a distance between the first and fourth atoms, or
 * both.
 */
@Generated("org.rcsb.cif.generator.SchemaGenerator")
public class ChemLinkTorValue extends BaseCategory {
    public ChemLinkTorValue(String name, Map<String, Column> columns) {
        super(name, columns);
    }

    public ChemLinkTorValue(String name, int rowCount, Object[] encodedColumns) {
        super(name, rowCount, encodedColumns);
    }

    public ChemLinkTorValue(String name) {
        super(name);
    }

    /**
     * This data item is a pointer to _chem_link_tor.id in the
     * CHEM_LINK_TOR category.
     * @return StrColumn
     */
    public StrColumn getTorId() {
        return (StrColumn) (isText ? textFields.computeIfAbsent("tor_id", StrColumn::new) :
                getBinaryColumn("tor_id"));
    }

    /**
     * A value that should be taken as a potential target value for the
     * torsion angle associated with the specified atoms, expressed in
     * degrees.
     * @return FloatColumn
     */
    public FloatColumn getAngle() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("angle", FloatColumn::new) :
                getBinaryColumn("angle"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _chem_link_tor_value.angle.
     * @return FloatColumn
     */
    public FloatColumn getAngleEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("angle_esd", FloatColumn::new) :
                getBinaryColumn("angle_esd"));
    }

    /**
     * A value that should be taken as a potential target value for the
     * torsion angle associated with the specified atoms, expressed as
     * the distance between the atoms specified by
     * _chem_link_tor.atom_id_1 and _chem_link_tor.atom_id_4 in the
     * referenced record in the CHEM_LINK_TOR list. Note that the
     * torsion angle cannot be fully specified by a distance (for
     * instance, a torsion angle of -60 degree will yield the same
     * distance as a 60 degree angle). However, the distance
     * specification can be useful for refinement in situations in
     * which the angle is already close to the desired value.
     * @return FloatColumn
     */
    public FloatColumn getDist() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("dist", FloatColumn::new) :
                getBinaryColumn("dist"));
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _chem_link_tor_value.dist.
     * @return FloatColumn
     */
    public FloatColumn getDistEsd() {
        return (FloatColumn) (isText ? textFields.computeIfAbsent("dist_esd", FloatColumn::new) :
                getBinaryColumn("dist_esd"));
    }
}
