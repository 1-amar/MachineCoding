package com.amar.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Table {
    String tableName;
    List<String> columns;
    Map<Integer, Row> rows;

    public Table(String tableName, List<String> columns) {
        this.columns = columns;
        this.tableName = tableName;
        rows = new HashMap<>();
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List<String> getColumns() {
        return columns;
    }

    public void setColumns(List<String> columns) {
        this.columns = columns;
    }

    public Map<Integer, Row> getRows() {
        return rows;
    }

    public void setRows(Map<Integer, Row> rows) {
        this.rows = rows;
    }


}

