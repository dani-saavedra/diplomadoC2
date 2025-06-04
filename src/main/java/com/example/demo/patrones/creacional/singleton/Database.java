package com.example.demo.patrones.creacional.singleton;

public class Database {

    private static Database instance;

    private Database() {
        //Conectarnos a la base de datos
        //JDBC connection
    }

    public synchronized static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }
    //-> Sincronización de recursos.
    //-> Condiciones de Carrera. (Race Conditions)
    //-> DeadLock
    //-> Starvation
}
