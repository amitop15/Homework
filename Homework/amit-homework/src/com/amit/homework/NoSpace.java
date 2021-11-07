package com.amit.homework;

import java.util.Scanner;

public class NoSpace {
    static String noSpace (String str){
        String strNoSpace = "";
        for (int i = 0; i < str.length() ; i++) {
            if (str.charAt(i) != ' ' ){
                strNoSpace += str.charAt(i);
            }
        }
        return strNoSpace;
    }

    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Please enter a string with spaces: ");
        String str = SCANNER.nextLine();
        System.out.print(noSpace(str));
    }

}
