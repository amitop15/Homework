package com.amit.homework;

import java.util.Scanner;

public class NameOfDogs {
    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String message = "The Dogs names are: ";
        System.out.print("Please enter the amount of dog names to store: ");
        final int numberOfDogs = SCANNER.nextInt();
        final String[] dogNames = new String[numberOfDogs];
        for (int i = 0; i < dogNames.length; i++) {
            System.out.print("Please enter the name of your dog: ");
            dogNames[i] = SCANNER.next();
            if (i< (dogNames.length - 1)){
                message += dogNames[i] + ", ";
            }
            else{
                message += dogNames[i] + ".";
            }
        }
        System.out.println(message);
    }
}
