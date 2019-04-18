package org.rcsb.cif.schema;

import java.util.Map;
import java.util.Set;

class Table {
    private final String description;
    private final Set<String> categoryKeyNames;
    private final Map<String, Object> columns;
    private final Schema.Repeat repeat;

    Table(String description, Set<String> categoryKeyNames, Map<String, Object> columns, Schema.Repeat repeat) {
        this.description = description;
        this.categoryKeyNames = categoryKeyNames;
        this.columns = columns;
        this.repeat = repeat;
    }

    public String getDescription() {
        return description;
    }

    public Set<String> getCategoryKeyNames() {
        return categoryKeyNames;
    }

    public Map<String, Object> getColumns() {
        return columns;
    }

    public Schema.Repeat getRepeat() {
        return repeat;
    }
}
