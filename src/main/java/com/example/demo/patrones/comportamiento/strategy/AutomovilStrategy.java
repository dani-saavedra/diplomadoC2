package com.example.demo.patrones.comportamiento.strategy;

public class AutomovilStrategy implements Estrategia {
    @Override
    public void realizarIngresoVehiculo() {
        System.out.println("Automovil Ingresado");
    }
}
