package com.amit.homework;

import java.util.Scanner;

public class Contains {
    static final Scanner SCANNER = new Scanner(System.in);

    public static boolean isSubString(String string, String subString) {
        for (int i = 0 , j = 0; i < string.length(); i++) {
            if (string.charAt(i) == subString.charAt(j)){
                j++;
                if(subString.length() == j){
                    return true;
                }
            }
            else{
                j = 0;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.print("Please enter a string: ");
        final String string = SCANNER.next();
        System.out.print("Please enter another string to check if it is a substring of the last string: ");
        final String subString = SCANNER.next();
        if (isSubString(string, subString)){
            System.out.println("The second string: " + subString + " is a substring of the first string: " + string);
        }
        else{
            System.out.println("The second string: " + subString + " isn't a substring of the first string: " + string);
        }
    }
}
