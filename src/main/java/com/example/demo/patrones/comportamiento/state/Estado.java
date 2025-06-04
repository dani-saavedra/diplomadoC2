package com.example.demo.patrones.comportamiento.state;

public interface Estado {
    void avanzar(Pedido pedido);

    void cancelar();
}
