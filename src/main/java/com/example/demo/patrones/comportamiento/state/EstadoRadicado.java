package com.example.demo.patrones.comportamiento.state;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EstadoRadicado implements Estado {
    @Override
    public void avanzar(Pedido pedido) {
        //Buscar el local que atienda la solicitud
        //bla bla bla
        if (pedido.isTurbo()) {
            pedido.setEstado(new EstadoFinalizado());
        } else {
            pedido.setEstado(new EstadoPreparando());
        }
    }

    @Override
    public void cancelar() {

    }
}
