package com.amar.model;

import java.util.Map;

public class Row {
    int Id;
    //Column to Value
    Map<String, String> values;

    public Row(int id, Map<String, String> values) {
        Id = id;
        this.values = values;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Map<String, String> getValues() {
        return values;
    }

    public void setValues(Map<String, String> values) {
        this.values = values;
    }
}
