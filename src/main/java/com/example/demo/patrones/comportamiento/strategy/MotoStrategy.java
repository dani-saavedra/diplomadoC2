package com.example.demo.patrones.comportamiento.strategy;

public class MotoStrategy implements Estrategia {
    @Override
    public void realizarIngresoVehiculo() {
        System.out.println("Moto Ingresado");
    }
}
