package com.example.demo.solid.inyeccion.alto;

public class Pago {

    public static final double VALOR_IVA = 0.19;
    private INotificacion notificacion;

    public Pago(INotificacion notificacion) {
        this.notificacion = notificacion;
    }

    public void realizarPago(int monto) {
        //Bla bla bla bla.
        System.out.println("Realizando pago....");
        double total = (monto * VALOR_IVA) + monto;
        boolean notificacionExitosa = notificacion.notificar("3025467079", "daniel.saavedra.fon@gmail.com");
    }
}
