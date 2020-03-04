package org.rcsb.cif.model;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * A column that provides String data.
 */
public interface StrColumn extends Column {
    /**
     * Type-safe access to the native type of data stored in this column.
     * @param row the index to retrieve
     * @return a String value
     */
    String get(int row);

    /**
     * A Stream of all registered values.
     * @return Strings
     */
    default Stream<String> values() {
        return IntStream.range(0, getRowCount())
                .mapToObj(this::get);
    }
}
