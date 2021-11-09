package com.amit.homework;

import java.util.Scanner;

public class MethodsHW {
    static final Scanner SCANNER = new Scanner(System.in);
    static final int FIRST_VAL = 0;

    static int secondSmallestInArr (int[] arr) {// This method find the second-smallest number in a given number array.
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest){
                smallest = arr[i];
            }
            if (arr[i] < secondSmallest && arr[i] > smallest){
                secondSmallest = arr[i];
            }
        }
        if (arr[FIRST_VAL] < secondSmallest && arr[FIRST_VAL] > smallest ){
            secondSmallest = arr[FIRST_VAL];
        }
        return secondSmallest;
    }
    static int findElementsSumZero(int[] arr){ //This method iterates through a number array and returns the amount of sub-arrays
        int sum = 0;                           //That contain numbers that sum to 0
        int sumsCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (sum == 0 || arr[i] == 0) {
                sumsCounter++;
            }
            sum += arr[i];
        }

        return sumsCounter;
    }

    public static void main(String[] args) {
        System.out.println("Please enter array length: ");
        final int[] arr = new int[SCANNER.nextInt()];
        for (int i = 0; i < arr.length ; i++) {
            System.out.print("Please enter array next value: ");
            arr[i] = SCANNER.nextInt();
        }
        System.out.println("The second smallest number in the array is: " + secondSmallestInArr(arr));
        // end of part 1
        System.out.println("The amount of sub arrays with sum of zero is: " + findElementsSumZero(arr));
    }
}
