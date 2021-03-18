package com.mypractice.HackerBlock;

import java.util.Scanner;

public class StringCountPallinSubString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            int left = i;
            int right = i + 1;

            while (left >= 0 && right < str.length()) {
                if (str.charAt(left) == str.charAt(right)) {
                    count++;
                }
                left--;
                right++;
            }
        }


        for (int i = 0; i < str.length(); i++) {
            int left = i;
            int right = i;

            while (left >= 0 && right < str.length()) {
                if (str.charAt(left) == str.charAt(right)) {
                    count++;
                }
                left--;
                right++;
            }
        }

        System.out.println(count);
    }
}
