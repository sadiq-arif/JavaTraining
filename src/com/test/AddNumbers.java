package com.test;

public class AddNumbers {

    public static void main(String[] args) {
        addNumbers(6,5);
        addNumbers(9,2);
        addNumbers(10,20);
    }

    public static void addNumbers(int num1, int num2){
        int result = num1 + num2;
        System.out.println("Answer: " +result);
    }
}
