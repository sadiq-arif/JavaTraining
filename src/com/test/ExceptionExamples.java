package com.test;

public class ExceptionExamples {
    public static void main(String[] args) {
        handleArithematicException(100);
        handleNullPointerException(null);
    }

    private static void handleNullPointerException(String s) {
        try{
            System.out.println(s.length());
        }
        catch (NullPointerException ex){
            ex.printStackTrace();
        }
    }

    private static void handleArithematicException(int number) {
        try{
            int a = number/0;
        }
        catch (ArithmeticException ex){
            ex.printStackTrace();
        }
    }
}
