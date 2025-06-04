package com.example.demo.unitest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraTest {

    Calculadora calculadora = new Calculadora();

    @Test
    void suma() {
        //AAA
        //Arrange, Act, Assert:
        //Prepare, ejecute y valide.
        int resultado = calculadora.suma(2, 3);
        assertEquals(5, resultado);

        //80%, 85% , 95% , 90%

        //Verde= todo esta bien, amarillo: no cumplio una validación
        //Rojo= Algo se daño.
    }
}