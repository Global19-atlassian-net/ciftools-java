package org.rcsb.cif.schema.generated.mm;

import org.rcsb.cif.model.*;
import org.rcsb.cif.schema.*;

import javax.annotation.Generated;

/**
 * 
 * The details about each spectrometer used to collect data for this
 * deposition.
 */
@Generated("org.rcsb.cif.schema.generator.SchemaGenerator")
public class PdbxNmrSpectrometer extends DelegatingCategory {
    public PdbxNmrSpectrometer(Category delegate) {
        super(delegate);
    }

    /**
     * 
     * Assign a numerical ID to each instrument.
     * @return StrColumn
     */
    public StrColumn getSpectrometerId() {
        return delegate.getColumn("spectrometer_id", DelegatingStrColumn::new);
    }

    /**
     * 
     * The model of the NMR spectrometer.
     * @return StrColumn
     */
    public StrColumn getModel() {
        return delegate.getColumn("model", DelegatingStrColumn::new);
    }

    /**
     * 
     * Select the instrument manufacturer(s) and the model(s) of the NMR(s)
     * used for this work.
     * @return StrColumn
     */
    public StrColumn getType() {
        return delegate.getColumn("type", DelegatingStrColumn::new);
    }

    /**
     * 
     * The name of the manufacturer of the spectrometer.
     * @return StrColumn
     */
    public StrColumn getManufacturer() {
        return delegate.getColumn("manufacturer", DelegatingStrColumn::new);
    }

    /**
     * 
     * Select the field strength for protons in MHz.
     * @return FloatColumn
     */
    public FloatColumn getFieldStrength() {
        return delegate.getColumn("field_strength", DelegatingFloatColumn::new);
    }

    /**
     * 
     * A text description of the NMR spectrometer.
     * @return StrColumn
     */
    public StrColumn getDetails() {
        return delegate.getColumn("details", DelegatingStrColumn::new);
    }

    /**
     * 
     * A label that uniquely identifies the NMR spectrometer from other spectrometers
     * listed in the entry.
     * @return StrColumn
     */
    public StrColumn getName() {
        return delegate.getColumn("name", DelegatingStrColumn::new);
    }
}
