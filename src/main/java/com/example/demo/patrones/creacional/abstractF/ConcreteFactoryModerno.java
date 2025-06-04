package com.example.demo.patrones.creacional.abstractF;

public class ConcreteFactoryModerno implements AbstractFactory {
    @Override
    public Sofa crearSofa() {
        return new SofaModerno();
    }

    @Override
    public Silla crearSilla() {
        return new SillaModerna();
    }
}
