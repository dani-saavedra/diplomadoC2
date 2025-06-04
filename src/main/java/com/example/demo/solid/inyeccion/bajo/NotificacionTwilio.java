package com.example.demo.solid.inyeccion.bajo;

import com.example.demo.solid.inyeccion.alto.INotificacion;

public class NotificacionTwilio implements INotificacion {

    @Override
    public boolean notificar(String telefono, String email) {
        System.out.println("Enviando notificacion Twilio Rest");
        // bla bla bla
        return true;
    }
}
