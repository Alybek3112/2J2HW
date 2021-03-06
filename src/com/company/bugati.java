package com.company;

public class bugati extends Sportcar {
    public int year;

    public bugati(int year, double volume) {
        super(volume);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void print() {
        System.out.println("" + getClass().getSimpleName() + "\n Обьём: " + super.getVolume()+"\n Год: "+getYear());
        super.print();
    }
}
