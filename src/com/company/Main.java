package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Car").print();
        createObject("bugati").print();
        createObject("ferari").print();

    }

    public static Printable createObject(String className) {
        Printable printable = null;
        switch (className) {
            case "Car":
                printable = new Car(5, "машина");
                break;
            case "bugati":
                printable = new bugati(2009, 4);
                break;
            case "ferari":
                printable = new ferari("Enzo", 876);
                break;

        }
        return printable;
    }
}
