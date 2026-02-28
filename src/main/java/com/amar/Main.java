package com.amar;

import com.amar.repository.TableRepository;
import com.amar.service.TableService;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Initialize table and services
        TableService tableService = new TableService();
        TableRepository tableRepository = new TableRepository(tableService);

        //Test Create Table
        tableRepository.createTable("T1", List.of("C1", "C2", "C3"));

        //Test Delete Table
        tableRepository.createTable("T2", List.of("C1"));
        tableRepository.deleteTable("T2");

        //Test Add Row
        tableRepository.createRow("T1", List.of("C1V1", "C2V2", "C3V3"));

        //Test Delete Row
        tableRepository.createRow("T1", List.of("C1V4", "C2V5", "C3V6"));
        tableRepository.deleteRow("T1", 2);

        //Test Update Row
        tableRepository.updateRow("T1", 1, Map.of("C1", "V0"));

        //Test CreateIndex


    }
}