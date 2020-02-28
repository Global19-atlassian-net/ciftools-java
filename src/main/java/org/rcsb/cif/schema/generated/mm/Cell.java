package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * Data items in the CELL category record details about the
 * crystallographic cell parameters.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class Cell extends DelegatingCategory {
    public Cell(Category delegate) {
        super(delegate);
    }

    /**
     * Unit-cell angle alpha of the reported structure in degrees.
     * @return FloatColumn
     */
    public FloatColumn getAngleAlpha() {
        return delegate.getColumn("angle_alpha", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _cell.angle_alpha.
     * @return FloatColumn
     */
    public FloatColumn getAngleAlphaEsd() {
        return delegate.getColumn("angle_alpha_esd", DelegatingFloatColumn::new);
    }

    /**
     * Unit-cell angle beta of the reported structure in degrees.
     * @return FloatColumn
     */
    public FloatColumn getAngleBeta() {
        return delegate.getColumn("angle_beta", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _cell.angle_beta.
     * @return FloatColumn
     */
    public FloatColumn getAngleBetaEsd() {
        return delegate.getColumn("angle_beta_esd", DelegatingFloatColumn::new);
    }

    /**
     * Unit-cell angle gamma of the reported structure in degrees.
     * @return FloatColumn
     */
    public FloatColumn getAngleGamma() {
        return delegate.getColumn("angle_gamma", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _cell.angle_gamma.
     * @return FloatColumn
     */
    public FloatColumn getAngleGammaEsd() {
        return delegate.getColumn("angle_gamma_esd", DelegatingFloatColumn::new);
    }

    /**
     * This data item is a pointer to _entry.id in the ENTRY category.
     * @return StrColumn
     */
    public StrColumn getEntryId() {
        return delegate.getColumn("entry_id", DelegatingStrColumn::new);
    }

    /**
     * A description of special aspects of the cell choice, noting
     * possible alternative settings.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * The number of the formula units in the unit cell as specified
     * by _chemical_formula.structural, _chemical_formula.moiety or
     * _chemical_formula.sum.
     * @return IntColumn
     */
    public IntColumn getFormulaUnitsZ() {
        return delegate.getColumn("formula_units_Z", DelegatingIntColumn::new);
    }

    /**
     * Unit-cell length a corresponding to the structure reported in
     * angstroms.
     * @return FloatColumn
     */
    public FloatColumn getLengthA() {
        return delegate.getColumn("length_a", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _cell.length_a.
     * @return FloatColumn
     */
    public FloatColumn getLengthAEsd() {
        return delegate.getColumn("length_a_esd", DelegatingFloatColumn::new);
    }

    /**
     * Unit-cell length b corresponding to the structure reported in
     * angstroms.
     * @return FloatColumn
     */
    public FloatColumn getLengthB() {
        return delegate.getColumn("length_b", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _cell.length_b.
     * @return FloatColumn
     */
    public FloatColumn getLengthBEsd() {
        return delegate.getColumn("length_b_esd", DelegatingFloatColumn::new);
    }

    /**
     * Unit-cell length c corresponding to the structure reported in
     * angstroms.
     * @return FloatColumn
     */
    public FloatColumn getLengthC() {
        return delegate.getColumn("length_c", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _cell.length_c.
     * @return FloatColumn
     */
    public FloatColumn getLengthCEsd() {
        return delegate.getColumn("length_c_esd", DelegatingFloatColumn::new);
    }

    /**
     * Cell volume V in angstroms cubed.
     * 
     * V = a b c (1 - cos^2^~alpha~ - cos^2^~beta~ - cos^2^~gamma~
     * + 2 cos~alpha~ cos~beta~ cos~gamma~)^1/2^
     * 
     * a     = _cell.length_a
     * b     = _cell.length_b
     * c     = _cell.length_c
     * alpha = _cell.angle_alpha
     * beta  = _cell.angle_beta
     * gamma = _cell.angle_gamma
     * @return FloatColumn
     */
    public FloatColumn getVolume() {
        return delegate.getColumn("volume", DelegatingFloatColumn::new);
    }

    /**
     * The standard uncertainty (estimated standard deviation)
     * of _cell.volume.
     * @return FloatColumn
     */
    public FloatColumn getVolumeEsd() {
        return delegate.getColumn("volume_esd", DelegatingFloatColumn::new);
    }

    /**
     * The number of the polymeric chains in a unit cell. In the case
     * of heteropolymers, Z is the number of occurrences of the most
     * populous chain.
     * 
     * This data item is provided for compatibility with the original
     * Protein Data Bank format, and only for that purpose.
     * @return IntColumn
     */
    public IntColumn getZPDB() {
        return delegate.getColumn("Z_PDB", DelegatingIntColumn::new);
    }

    /**
     * The angle (recip-alpha) defining the reciprocal cell in degrees.
     * (recip-alpha), (recip-alpha) and (recip-alpha) related to the
     * angles in the real cell by:
     * 
     * cos(recip-alpha)
     * = [cos(beta)*cos(gamma) - cos(alpha)]/[sin(beta)*sin(gamma)]
     * 
     * cos(recip-beta)
     * = [cos(gamma)*cos(alpha) - cos(beta)]/[sin(gamma)*sin(alpha)]
     * 
     * cos(recip-gamma)
     * = [cos(alpha)*cos(beta) - cos(gamma)]/[sin(alpha)*sin(beta)]
     * 
     * Ref: Buerger, M. J. (1942). X-ray Crystallography, p. 360.
     * New York: John Wiley &amp; Sons Inc.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalAngleAlpha() {
        return delegate.getColumn("reciprocal_angle_alpha", DelegatingFloatColumn::new);
    }

    /**
     * The angle (recip-beta) defining the reciprocal cell in degrees.
     * (recip-alpha), (recip-alpha) and (recip-alpha) related to the
     * angles in the real cell by:
     * 
     * cos(recip-alpha)
     * = [cos(beta)*cos(gamma) - cos(alpha)]/[sin(beta)*sin(gamma)]
     * 
     * cos(recip-beta)
     * = [cos(gamma)*cos(alpha) - cos(beta)]/[sin(gamma)*sin(alpha)]
     * 
     * cos(recip-gamma)
     * = [cos(alpha)*cos(beta) - cos(gamma)]/[sin(alpha)*sin(beta)]
     * 
     * Ref: Buerger, M. J. (1942). X-ray Crystallography, p. 360.
     * New York: John Wiley &amp; Sons Inc.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalAngleBeta() {
        return delegate.getColumn("reciprocal_angle_beta", DelegatingFloatColumn::new);
    }

    /**
     * The angle (recip-gamma) defining the reciprocal cell in degrees.
     * (recip-alpha), (recip-alpha) and (recip-alpha) related to the
     * angles in the real cell by:
     * 
     * cos(recip-alpha)
     * = [cos(beta)*cos(gamma) - cos(alpha)]/[sin(beta)*sin(gamma)]
     * 
     * cos(recip-beta)
     * = [cos(gamma)*cos(alpha) - cos(beta)]/[sin(gamma)*sin(alpha)]
     * 
     * cos(recip-gamma)
     * = [cos(alpha)*cos(beta) - cos(gamma)]/[sin(alpha)*sin(beta)]
     * 
     * Ref: Buerger, M. J. (1942). X-ray Crystallography, p. 360.
     * New York: John Wiley &amp; Sons Inc.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalAngleGamma() {
        return delegate.getColumn("reciprocal_angle_gamma", DelegatingFloatColumn::new);
    }

    /**
     * The estimated standard deviation of _cell.reciprocal_angle_alpha.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalAngleAlphaEsd() {
        return delegate.getColumn("reciprocal_angle_alpha_esd", DelegatingFloatColumn::new);
    }

    /**
     * The estimated standard deviation of _cell.reciprocal_angle_beta.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalAngleBetaEsd() {
        return delegate.getColumn("reciprocal_angle_beta_esd", DelegatingFloatColumn::new);
    }

    /**
     * The estimated standard deviation of _cell.reciprocal_angle_gamma.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalAngleGammaEsd() {
        return delegate.getColumn("reciprocal_angle_gamma_esd", DelegatingFloatColumn::new);
    }

    /**
     * The reciprocal cell length (recip-a) in inverse Angstroms.
     * (recip-a), (recip-b) and (recip-c) are related to the real cell
     * by the following equation:
     * 
     * recip-a = b*c*sin(alpha)/V
     * 
     * recip-b = c*a*sin(beta)/V
     * 
     * recip-c = a*b*sin(gamma)/V
     * 
     * where V is the cell volume.
     * 
     * Ref: Buerger, M. J. (1942). X-ray Crystallography, p. 360.
     * New York: John Wiley &amp; Sons Inc.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalLengthA() {
        return delegate.getColumn("reciprocal_length_a", DelegatingFloatColumn::new);
    }

    /**
     * The reciprocal cell length (recip-b) in inverse Angstroms.
     * (recip-a), (recip-b) and (recip-c) are related to the real cell
     * by the following equation:
     * 
     * recip-a = b*c*sin(alpha)/V
     * 
     * recip-b = c*a*sin(beta)/V
     * 
     * recip-c = a*b*sin(gamma)/V
     * 
     * where V is the cell volume.
     * 
     * Ref: Buerger, M. J. (1942). X-ray Crystallography, p. 360.
     * New York: John Wiley &amp; Sons Inc.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalLengthB() {
        return delegate.getColumn("reciprocal_length_b", DelegatingFloatColumn::new);
    }

    /**
     * The reciprocal cell length (recip-c) in inverse Angstroms.
     * (recip-a), (recip-b) and (recip-c) are related to the real cell
     * by the following equation:
     * 
     * recip-a = b*c*sin(alpha)/V
     * 
     * recip-b = c*a*sin(beta)/V
     * 
     * recip-c = a*b*sin(gamma)/V
     * 
     * where V is the cell volume.
     * 
     * Ref: Buerger, M. J. (1942). X-ray Crystallography, p. 360.
     * New York: John Wiley &amp; Sons Inc.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalLengthC() {
        return delegate.getColumn("reciprocal_length_c", DelegatingFloatColumn::new);
    }

    /**
     * The estimated standard deviation of _cell.reciprocal_length_a.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalLengthAEsd() {
        return delegate.getColumn("reciprocal_length_a_esd", DelegatingFloatColumn::new);
    }

    /**
     * The estimated standard deviation of _cell.reciprocal_length_b.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalLengthBEsd() {
        return delegate.getColumn("reciprocal_length_b_esd", DelegatingFloatColumn::new);
    }

    /**
     * The estimated standard deviation of _cell.reciprocal_length_c.
     * @return FloatColumn
     */
    public FloatColumn getReciprocalLengthCEsd() {
        return delegate.getColumn("reciprocal_length_c_esd", DelegatingFloatColumn::new);
    }

    /**
     * To further identify unique axis if necessary.  E.g., P 21 with
     * an unique C axis will have 'C' in this field.
     * @return StrColumn
     */
    public StrColumn getPdbxUniqueAxis() {
        return delegate.getColumn("pdbx_unique_axis", DelegatingStrColumn::new);
    }
}