package com.example.demo.patrones.comportamiento.chain;

public class Manejador500 implements Manejador {

    @Override
    public boolean validarMoneda(Moneda moneda) {
        return "500 Pesos".equals(moneda.getTexto()) || "500 Nuevos Pesos".equals(moneda.getTexto());//,mas validaciones.
    }

    @Override
    public int obtenerValorMoneda() {
        return 500;
    }
}
