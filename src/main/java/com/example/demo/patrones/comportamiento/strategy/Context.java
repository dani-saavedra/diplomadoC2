package com.example.demo.patrones.comportamiento.strategy;

public class Context {

    public void recibirVehiculo(Estrategia vehiculo) {
        //bla bla otra logica
        vehiculo.realizarIngresoVehiculo();
        //bla bla otra logica
    }
}
