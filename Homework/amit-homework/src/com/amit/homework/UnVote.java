package com.amit.homework;

import java.util.Scanner;

public class UnVote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int voteFor = 0;
        int voteAgainst = 0;
        int voteAbstain = 0;
        int vote;
        System.out.print("Please enter your vote (1 = For, 2 = Against, 3 = Abstain, 4 = Veto");
        for (int i = 1; i <= 10; i++) {
            vote = scanner.nextInt();
            switch (vote){
                case 1:
                    voteFor ++;
                    break;
                case 2:
                    voteAgainst++;
                    break;
                case 3:
                    voteAbstain++;
                    break;
                case 4:
                    System.out.println("Country number " + i + " dropped veto");
                    return;
                default:
                    System.out.println("This vote is invalid and the voting process is canceled");
                    return;
            }
        }
        System.out.println("The result of the votes is:\n" +
                            "For: " + voteFor +"\n" +
                            "Against: " + voteAgainst + "\n" +
                            "Abstain: " + voteAbstain);
    }
}
