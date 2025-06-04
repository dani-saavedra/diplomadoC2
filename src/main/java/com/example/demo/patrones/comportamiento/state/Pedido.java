package com.example.demo.patrones.comportamiento.state;

import java.util.List;

public class Pedido {

    private List<String> productos;
    private Estado estado;
    private boolean turbo;

    public Pedido(List<String> productos, boolean turbo) {
        estado = new EstadoRadicado();
        this.productos = productos;
        this.turbo = turbo;

    }

    public void avanzarPedido() {
        estado.avanzar(this);
    }

    public boolean isTurbo() {
        return turbo;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void verEstado() {
        System.out.println("Estado: " + estado);
    }
}
