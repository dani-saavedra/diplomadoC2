package com.example.demo.patrones.comportamiento.strategy;

public class AvionStrategy implements Estrategia {
    @Override
    public void realizarIngresoVehiculo() {
        //Bla bla bla la logica para ingresar el avion
        //Factory Method
        System.out.println("Avion Ingresado");
    }
}
