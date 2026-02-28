package com.amar.repository;

import com.amar.model.Index;
import com.amar.model.Row;
import com.amar.model.Table;
import com.amar.service.TableService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TableRepository {

    TableService tableService;

    Map<String, Table> tables = new HashMap<>();
    //tableName, columnName, Id, value
    Map<String, Index> indices = new HashMap<>();

    public TableRepository(TableService tableService) {
        this.tableService = tableService;
    }

    public void createTable(String tableName, List<String> columns){
        Table table = tableService.createTable(tableName, columns);
        tables.put(tableName, table);
    }

    public void deleteTable(String tableName){
        tables.remove(tableName);
    }

    public void createRow(String tableName, List<String> values){
        Row row = tableService.createRow(tables.get(tableName), values);
        Table table = tables.get(tableName);
        tableService.addRow(table, row);
    }

    public void updateRow(String tableName, int rowId, Map<String, String> columnMap){
        Table table = tables.get(tableName);
        tableService.updateRow(table, rowId, columnMap);
    }

    public void deleteRow(String tableName, int rowId){
        Table table = tables.get(tableName);
        tableService.deleteRow(table, rowId);
    }

    public void createIndex(String tableName, String columnName){
        Table table = tables.get(tableName);

    }

    public Map<String, Table> getTables() {
        return tables;
    }
}
