package com.mypractice.HackerBlock;

import java.util.Scanner;

public class RecursionSubseq {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String unprocessed = s.nextLine();
        String processed = "";

        System.out.println("\n" + subseq(processed, unprocessed, 0));
    }


    public static int subseq(String processed, String unprocessed, int count) {
        if (unprocessed.isEmpty()) {
            System.out.print(processed + " ");
            return 1;
        }
        char ch = unprocessed.charAt(0);

        count += subseq(processed, unprocessed.substring(1), 0);
        count += subseq(processed + ch, unprocessed.substring(1), 0);


        return count;
    }

}