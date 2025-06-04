package com.example.demo.solid;

public class Main {


    public static final String AUTO_MERCEDEZ = "Mercedez";

    /*
    public static void main(String[] args) {

        Carro carroMg = new Carro("MG");
        Carro carroAudi = new Carro("Audi");
        Carro carroMercedez = new Carro(AUTO_MERCEDEZ);
        Carro carroByd = new Carro("BYD");

        Carro[] carros = new Carro[]{carroMg, carroAudi, carroMercedez};
    }

    public static void verPrecioVehiculo(Carro[] carros) {
        //No fue cerrado a modificación y no es abierto a extensión.
        for (Carro carro : carros) {
            if (AUTO_MERCEDEZ.equals(carro.getMarca())) {
                System.out.println("2000");
            } else if (carro.getMarca().equals("Audi")) {
                System.out.println("1000");
            } else if (carro.getMarca().equals("MG")) {
                System.out.println("500");
            }
        }
    }
    //Dead Code
    */
}
