package com.test;

public class ModifyString {

    public static void main(String[] args) {
        String s1 = "Learning Java";
        String s2 = "Basics";

        System.out.println("Length of the string is: "+ s1.length());
        System.out.println("Upper case of string is: "+ s1.toUpperCase());
        System.out.println("Lower case of string is: "+ s1.toLowerCase());
        System.out.println("Get char: "+ s1.indexOf("n"));
        System.out.println("Get position: "+ s1.charAt(3));
        System.out.println(s1 + " " + s2);
    }
}
