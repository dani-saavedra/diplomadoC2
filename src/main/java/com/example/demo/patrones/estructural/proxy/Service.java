package com.example.demo.patrones.estructural.proxy;

public class Service implements Internet {
    @Override
    public String navegar(String url) {
        return "Navegando en el sitio " + url;
    }
}
