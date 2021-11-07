package com.amit.homework;

import java.util.Arrays;
import java.util.Scanner;

public class SignedArraySort {
    static final Scanner SCANNER = new Scanner(System.in);
    public static int[] sortSigned(int[] arr){
        int[] arrSorted = arr.clone();
        int start = 0;
        int i = 0;

        while (i < arrSorted.length) {
            if (arrSorted[i] < 0) {
                int temp = arrSorted[i];
                arrSorted[i] = arrSorted[start];
                arrSorted[start] = temp;
                start++;
                i++;
            }
            else {
                i++;
            }
        }
        return arrSorted;
    }

    public static void main(String[] args) {
        System.out.print("Please enter a number for the length of array: ");
        final int[] arr = new int[SCANNER.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Please enter a number to put in index #" + i + ": ");
            arr[i] = SCANNER.nextInt();
        }
        System.out.println("The array currently is: " + Arrays.toString(arr));
        System.out.println("After sorting the array it is:" + Arrays.toString(sortSigned(arr)));
    }
}
