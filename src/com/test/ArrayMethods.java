package com.test;

import java.util.Arrays;

public class ArrayMethods {

    public static void main(String[] args) {
        int arr[] = {9,4,1,8,10};
        int arr2[] = {4,5,6,7,1};
        Arrays.sort(arr);
        System.out.println("Length of array is: " + arr.length);
        System.out.println("Sorted array is: " + Arrays.toString(arr));

        if(arr.equals(arr2))
            System.out.println("Arrays are equal");
        else
            System.out.println("Arrays are not equal");
    }
}
