package org.rcsb.cif.binary.data;

import org.rcsb.cif.binary.encoding.DeltaEncoding;

/**
 * An array of signed integer numbers.
 */
public interface SignedIntArray extends IntArray {
    default boolean isSigned() {
        return true;
    }

    SignedIntArray encode(DeltaEncoding encoding);

    SignedIntArray decode(DeltaEncoding encoding);
}
