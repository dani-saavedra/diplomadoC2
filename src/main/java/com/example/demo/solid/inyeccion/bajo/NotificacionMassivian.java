package com.example.demo.solid.inyeccion.bajo;

import com.example.demo.solid.inyeccion.alto.INotificacion;

public class NotificacionMassivian implements INotificacion {

    @Override
    public boolean notificar(String telefono, String email) {
        System.out.println("Enviando notificacion Massivian SOAP");
        // bla bla bla
        return true;
    }
}
