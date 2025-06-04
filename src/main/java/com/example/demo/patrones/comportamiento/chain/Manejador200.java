package com.example.demo.patrones.comportamiento.chain;

public class Manejador200 implements Manejador {

    @Override
    public boolean validarMoneda(Moneda moneda) {
        return "200 Pesos".equals(moneda.getTexto());//,mas validaciones.
    }

    @Override
    public int obtenerValorMoneda() {
        return 200;
    }
}
