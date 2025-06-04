package com.example.demo.patrones.creacional.abstractF;

public class ConcreteFactoryVictoriano implements AbstractFactory {
    @Override
    public Sofa crearSofa() {
        return new SofaVictoriano();
    }

    @Override
    public Silla crearSilla() {
        return new SillaVictoriana();
    }
}
