package com.example.demo.patrones.creacional.abstractF;

public class Main {
    public static void main(String[] args) {
        Decorador decorador = new Decorador();
        decorador.decorar(new ConcreteFactoryVictoriano());
        //decorador.decorar(new ConcreteFactoryModerno());
    }
}
