package com.example.demo.patrones.comportamiento.chain;

import java.util.ArrayList;
import java.util.List;

// Recibir un listado de monedas, poder configurar que monedas vamos a recibir
//Poder llegar a quitar o modificar el tipo de moneda.
// Para identificar la moneda, lo vamos hacer a través del texto de la moneda.
public class Marranito {

    private List<Manejador> manejadors;

    public Marranito() {
        this.manejadors = new ArrayList<>();
        manejadors.add(new Manejador200());
        manejadors.add(new Manejador100());
        manejadors.add(new Manejador500());
    }

    /*
        public int calculeDineroIngresado(List<Moneda> monedas) {
            int sumaTotal = 0;
            for (Moneda moneda : monedas) {
                // Open closed.
                if ("50 Pesos".equals(moneda.getTexto())) {
                    sumaTotal += 50;
                } else if (moneda.getTexto().equals("100 Pesos")) {
                    sumaTotal += 100;
                } else if (moneda.getTexto().equals("200 Pesos")) {
                    sumaTotal += 200;
                }
            }
            return sumaTotal;
        }
         */
    public int calculeDineroIngresado(List<Moneda> monedas) {
        int suma = 0;
        for (Moneda moneda : monedas) {
            for (Manejador manejador : manejadors) {
                if (manejador.validarMoneda(moneda)) {
                    suma += manejador.obtenerValorMoneda();
                    break;
                }
            }
        }
        return suma;
    }
}
