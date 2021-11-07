package com.amit.homework;

import java.util.Random;

public class ReverseArrayInt {
    static  final Random RANDOM = new Random();

    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println("Original array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = RANDOM.nextInt(50);
            System.out.print(arr[i] + ", ");
        }
        System.out.print("\nReversed array\n");
        for (int i = (arr.length - 1); i >= 0 ; i--) {
            System.out.print(arr[i] + ", ");
        }
    }
}
