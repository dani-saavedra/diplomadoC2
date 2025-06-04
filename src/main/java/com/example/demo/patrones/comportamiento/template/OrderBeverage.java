package com.example.demo.patrones.comportamiento.template;

public class OrderBeverage extends Order {
    @Override
    protected void calcularPrecio() {
        //no se cobra impuestos

    }

    @Override
    protected void preparPedido() {
        //bla bla bla
    }
}
