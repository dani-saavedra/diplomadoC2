package com.example.demo.patrones.comportamiento.chain;

public interface Manejador {

    boolean validarMoneda(Moneda moneda);

    int obtenerValorMoneda();
}
