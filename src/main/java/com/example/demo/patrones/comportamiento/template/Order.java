package com.example.demo.patrones.comportamiento.template;

public abstract class Order {

    public void gestionarPedido() {
        tomarPedido();
        verificarDisponibilidad();
        preparPedido();
        calcularPrecio();
    }

    protected abstract void calcularPrecio();

    private void verificarDisponibilidad() {
        //Consulta a la base de datos bla bla bla
    }

    protected abstract void preparPedido();

    private void tomarPedido() {
        //Apunta bla bla bla
    }
}
