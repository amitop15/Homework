package com.amit.homework;

import java.util.Scanner;

public class UnVoteArray {

    static final Scanner SCANNER = new Scanner(System.in);
    static final int IN_FAVOR = 0;
    static final int AGAINST = 1;
    static final int ABSTAIN = 2;
    static final int NUMBER_OF_COUNTRIES = 10;

    public static void main(String[] args) {
        final int[] countryVote = { 0 , 0 , 0 };
        for (int i = 1; i <= NUMBER_OF_COUNTRIES; i++) {
            System.out.print("please enter your vote 0 = in favor, 1 = against, 2 = abstain and any other number to drop veto: ");
            final int vote = SCANNER.nextInt();
            if (vote > 2 || vote < 0 ){
                System.out.println("Country " + i + " has dropped veto");
                return;
            }
            countryVote[vote]++;
        }
        System.out.println("in favor: " + countryVote[IN_FAVOR]);
        System.out.println("against: " + countryVote[AGAINST]);
        System.out.println("abstain: " + countryVote[ABSTAIN]);
    }
}
