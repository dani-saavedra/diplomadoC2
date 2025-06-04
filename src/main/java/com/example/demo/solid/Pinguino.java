package com.example.demo.solid;

public class Pinguino implements Ave {
    @Override
    public void comer() {

    }

    @Override
    public void dormir() {

    }

    @Override
    public void volar() {
        throw new UnsupportedOperationException();
    }
}
