package com.amit.homework;

import java.util.Random;

public class BigAndSmall {
    static  final Random RANDOM = new Random();

    public static void main(String[] args) {
        final int[] arr = new int[10];
        int minNum, maxNum;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = RANDOM.nextInt(1000);
            System.out.print(arr[i] + ", ");
        }
        minNum = arr[0];
        maxNum = minNum;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minNum) {
                minNum = arr[i];
            }
            else if (arr[i] > maxNum){
                maxNum = arr[i];
            }
        }
        System.out.print("\nThe biggest num in the array is: " + maxNum + " \n and the smallest is: " + minNum);
    }
}
