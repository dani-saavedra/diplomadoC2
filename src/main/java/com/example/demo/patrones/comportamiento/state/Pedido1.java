package com.example.demo.patrones.comportamiento.state;

import java.util.List;

public class Pedido1 {

    private List<String> pedido;
    private String estado;

    public Pedido1() {
        estado = "Radicada";
    }

    public void avanzarPedido() {
        if (estado == "Radicada") {
            //Buscar el local que atienda la solicitud
            //bla bla bla
            estado = "Preparando";
        } else if (estado == "Preparando") {
            //Logica para buscar el domiciliario.
            estado = "En Reparto";
        } else if (estado == "En Reparto") {
            //Notificamos al cliente que su pedido va en camino...
            estado = "Finalizado";
        }
    }
}
