package com.example.demo.patrones.creacional.singleton;

public class Main {

    public static void main(String[] args) {
        Database database = Database.getInstance();
        System.out.println(database);

        Database otraDatabase = Database.getInstance();
        System.out.println(otraDatabase);
        //Stack && Heap
    }
}
