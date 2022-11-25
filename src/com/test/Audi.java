package com.test;

public class Audi {

    public static void main(String[] args) {

        Car audi = new Car();
        audi.setColor("Black");
        audi.setSize(60);
        audi.setWeight(21.34);
        audi.displayCar();

        Car.start();
        Car.accerlate();
        displayLogo("Bangles");
        displayLogo(4);
    }

    public static void displayLogo(String s1){
        System.out.println("Logo is: " + s1);
    }

    public static void displayLogo(int s) {
        System.out.println("Logo is: " + s);
    }
}
