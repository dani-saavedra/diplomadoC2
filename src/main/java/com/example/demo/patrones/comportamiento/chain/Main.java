package com.example.demo.patrones.comportamiento.chain;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Marranito marranito = new Marranito();
        ArrayList<Moneda> monedas = new ArrayList<>();
        monedas.add(new Moneda("1 Euro"));
        monedas.add(new Moneda("1 Dolar"));
        monedas.add(new Moneda("100 Pesos"));
        monedas.add(new Moneda("200 Pesos"));
        monedas.add(new Moneda("100 Soles"));
        monedas.add(new Moneda("500 Nuevos Pesos"));
        monedas.add(new Moneda("500 Pesos"));

        int total = marranito.calculeDineroIngresado(monedas);

        System.out.println("Total Ingresado " + total);
    }
}
