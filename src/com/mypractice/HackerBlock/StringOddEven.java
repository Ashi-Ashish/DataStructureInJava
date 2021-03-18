package com.mypractice.HackerBlock;

import java.util.Scanner;

public class StringOddEven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(oddEven(str));
    }

    public static String oddEven(String str) {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (i % 2 == 0) {
                ch = (char) (ch + 1);

            } else {
                ch = (char) (ch - 1);
            }
            builder.append(ch);
        }
        return builder.toString();
    }
}