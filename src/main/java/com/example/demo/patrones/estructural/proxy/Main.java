package com.example.demo.patrones.estructural.proxy;

public class Main {

    public static void main(String[] args) {
        Internet internet = new Proxy();
        System.out.println(internet.navegar("rushbet.com"));

    }
}
