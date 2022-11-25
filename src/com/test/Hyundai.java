package com.test;

public class Hyundai extends Car{

    public static void main(String[] args) {
        start();
        accerlate();
        brakes();
    }

    public static void brakes() {
        System.out.println("Press the brakes");
    }

    public static void start(){
        String key = "ON";
        System.out.println("Turn the key " + key);
    }
}
