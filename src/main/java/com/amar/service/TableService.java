package com.amar.service;

import com.amar.model.Row;
import com.amar.model.Table;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class TableService {

    Map<String, Integer> idxMap = new HashMap<>();
    // 1000 threads -


    public Table createTable(String tableName, List<String> columns){
        return new Table(tableName, columns);
    }

    public Row createRow(Table table, List<String> values){
        int rowId = idxMap.getOrDefault(table.getTableName(), 0)+1;
        idxMap.put(table.getTableName(), rowId);
        Map<String, String> valuesMap = new HashMap<>();
        for(int itr = 0; itr < table.getColumns().size(); itr++){
            valuesMap.put(table.getColumns().get(itr), values.get(itr));
        }
        return new Row(rowId, valuesMap);
    }

    public void addRow(Table table, Row row){
        table.getRows().put(row.getId(), row);
    }

    public void deleteRow(Table table, int rowId){
        table.getRows().remove(rowId);
    }

    public void updateRow(Table table, int rowId, Map<String, String> columns) {
        Row row = table.getRows().get(rowId);
        for (Map.Entry<String, String> entry : columns.entrySet()) {
            row.getValues().put(entry.getKey(), entry.getValue());
        }
    }

    public void createIndex(Table table, String columnName){
        //TODO.
    }
}
