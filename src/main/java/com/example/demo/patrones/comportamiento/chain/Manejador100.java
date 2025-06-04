package com.example.demo.patrones.comportamiento.chain;

public class Manejador100 implements Manejador {

    @Override
    public boolean validarMoneda(Moneda moneda) {
        return "100 Pesos".equals(moneda.getTexto());//,mas validaciones.
    }

    @Override
    public int obtenerValorMoneda() {
        return 100;
    }
}
