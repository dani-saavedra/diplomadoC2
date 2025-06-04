package com.example.demo.solid;

public class Audi implements Carro {


    @Override
    public String obtenerPrecio() {
        return "1000";
    }

    public int obtenerPuertas() {
        return 2;
    }
}
