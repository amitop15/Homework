package com.amit.homework;

import java.util.Scanner;

public class Fibo {

    static int getFib(int index) {
        int a = 0, b = 1, c;
        if (index == 0)
            return a;
        for (int i = 2; i <= index; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an index number to which I thy program will count to: ");
        int fibIndex = (int) scanner.nextDouble();
        int fibonacci = getFib(fibIndex);
        System.out.println("The fibonacci number I calculated is: " + fibonacci);
        }
    }
