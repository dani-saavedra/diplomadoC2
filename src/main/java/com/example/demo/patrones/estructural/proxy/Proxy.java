package com.example.demo.patrones.estructural.proxy;

public class Proxy implements Internet {

    private Internet internet;

    public Proxy() {
        this.internet = new Service();
    }

    @Override
    public String navegar(String url) {
        if (url.contains("xxx") || url.contains("bet")) {
            throw new RuntimeException("Sitios prohibidos");
        }
        return internet.navegar(url);
    }
}
