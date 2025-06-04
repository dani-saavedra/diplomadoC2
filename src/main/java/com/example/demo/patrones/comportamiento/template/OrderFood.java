package com.example.demo.patrones.comportamiento.template;

public class OrderFood extends Order {

    @Override
    protected void calcularPrecio() {
        //Comida tiene un impuesto del 18%
        //bla bla bla
    }

    @Override
    protected void preparPedido() {
        //Chef especializados bla bla
    }
}
