package org.rcsb.cif.model.generated.entity;

import org.rcsb.cif.model.*;

import java.util.Map;

public class PdbxFragment extends StrColumn {
    public PdbxFragment(String data, int startToken, int endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PdbxFragment(String data, int[] startToken, int[] endToken, String name) {
        super(data, startToken, endToken, name);
    }

    public PdbxFragment(Map<String, Object> encodedColumn) {
        super(encodedColumn);
    }
}
