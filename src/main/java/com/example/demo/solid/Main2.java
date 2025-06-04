package com.example.demo.solid;

public class Main2 {

    public static void main(String[] args) {

        Carro[] carros = new Carro[]{new Mercedez(), new Audi()};
    }

    public static void verPrecioVehiculo(Carro[] carros) {
        //No fue cerrado a modificación y no es abierto a extensión.
        //Abierto a extensión y cerrado a modificación.
        for (Carro carro : carros) {
            System.out.println(carro.obtenerPrecio());
        }
    }

    public static void mostrarCantidadPuertas(Carro[] carros) {

        for (Carro carro : carros) {
            if (carro instanceof Mercedez) {
                System.out.println(((Mercedez) carro).numeroPuertas());
            } else if (carro instanceof Audi) {
                System.out.println(((Audi) carro).obtenerPuertas());
            }
        }
    }

    public void cualquierCosa() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
