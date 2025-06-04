package com.example.demo.solid;

public class Mercedez implements Carro {

    @Override
    public String obtenerPrecio() {
        return "2000";
    }

    public int numeroPuertas() {
        return 4;
    }
}
