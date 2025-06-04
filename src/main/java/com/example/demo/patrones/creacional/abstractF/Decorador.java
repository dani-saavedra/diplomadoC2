package com.example.demo.patrones.creacional.abstractF;

public class Decorador {

    /*
    public void decorar(String estiloDecoracion) {
        if ("Victoriano".equals(estiloDecoracion)) {
            SillaVictoriana sillaVictoriana = new SillaVictoriana();
            SofaVictoriano sofaVictoriano = new SofaVictoriano();
        } else if ("Moderno".equals(estiloDecoracion)) {
            SillaModerna sillaModerna = new SillaModerna();
            SofaModerno sofaModerno = new SofaModerno();
        }
    }
     */
    public void decorar(AbstractFactory estiloDecoracion) {
        Silla silla = estiloDecoracion.crearSilla();
        Sofa sofa = estiloDecoracion.crearSofa();

        silla.describir();
        sofa.describir();
    }

}
