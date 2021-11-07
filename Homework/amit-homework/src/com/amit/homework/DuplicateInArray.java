package com.amit.homework;

import java.util.Arrays;
import java.util.Random;

public class DuplicateInArray {
    static  final Random RANDOM = new Random();
    static final int ARRAY_LENGTH = 20;

    public static void main(String[] args) {
        int dupCounter = 0;
        final int[] arr = new int[ARRAY_LENGTH];
        int[] arrDup = new int[ARRAY_LENGTH / 2];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = RANDOM.nextInt(40);
        }
        Arrays.sort(arr);
        System.out.print(Arrays.toString(arr));
        System.out.print("\nThe duplicates are: ");
        int storedDup = arr[arr.length -1] + 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == arr[i+1] && arr[i] != storedDup){
                System.out.print(arr[i] + ", ");
                storedDup = arr[i];
            }
        }
    }
}
