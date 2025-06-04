package com.example.demo.solid.inyeccion;

import com.example.demo.solid.inyeccion.alto.Pago;
import com.example.demo.solid.inyeccion.bajo.NotificacionMassivian;
import com.example.demo.solid.inyeccion.bajo.NotificacionTwilio;

public class Main {

    public static void main(String[] args) {

        Pago pago = new Pago(new NotificacionTwilio());
        pago.realizarPago(2000);
    }
}
