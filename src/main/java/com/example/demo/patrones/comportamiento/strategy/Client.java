package com.example.demo.patrones.comportamiento.strategy;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.recibirVehiculo(new AvionStrategy());
    }
}
