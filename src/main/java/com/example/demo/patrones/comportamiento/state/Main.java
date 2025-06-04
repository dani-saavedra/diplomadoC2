package com.example.demo.patrones.comportamiento.state;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pedido pedidoDaniel = new Pedido(new ArrayList<>(), true);
        pedidoDaniel.verEstado();

        pedidoDaniel.avanzarPedido();
        pedidoDaniel.verEstado();
    }
}
