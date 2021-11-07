package com.amit.homework;

import java.util.Scanner;

public class ReverseString {
    static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        String reverseStr = "";
        System.out.print("Please enter a string to be reversed: ");
        final String string = SCANNER.next();
        for (int i = string.length() - 1; i >= 0; i--) {
            reverseStr += string.charAt(i);
        }
        System.out.println("The reversed string is: " + reverseStr);
    }
}
