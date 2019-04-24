package org.rcsb.cif.model.structconf;

import org.rcsb.cif.model.*;

import javax.annotation.Generated;

@Generated("org.rcsb.cif.internal.generator.SchemaGenerator")
public class PdbxPDBHelixLength extends IntColumn {
    public PdbxPDBHelixLength(String name, int rowCount, String data, int[] startToken, int[] endToken) {
        super(name, rowCount, data, startToken, endToken);
    }

    public PdbxPDBHelixLength(String name, int rowCount, Object data, int[] mask) {
        super(name, rowCount, data, mask);
    }

    public PdbxPDBHelixLength(String name) {
        super(name);
    }
}