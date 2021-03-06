package com.company;

public class ferari extends Sportcar {
    private String motor;

    public ferari(String motor, double volume) {
        super(volume);
        this.motor = motor;
    }

    public String getMotor() {
        return motor;
    }

    public void print() {
        System.out.println("" + getClass().getSimpleName() + "\n Обьём: " + super.getVolume()+"\n Мотор: "+getMotor());
        super.print();
    }
}

