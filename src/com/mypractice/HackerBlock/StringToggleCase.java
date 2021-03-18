package com.mypractice.HackerBlock;

import java.util.Scanner;

public class StringToggleCase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();

        System.out.println(toggle(str));
    }

    public static String toggle(String str) {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch - 'A' + 'a');
            } else {
                ch = (char) (ch - 'a' + 'A');
            }
            builder.append(ch);
        }

        return builder.toString();
    }
}
