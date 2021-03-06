package com.company;

public class Sportcar implements Printable {
    private double volume;

    public Sportcar(double volume){
        this.volume=volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public void print() {
        System.out.println(" "+getClass().getSimpleName()+"\n Обьем: "+getVolume());
    }
}
