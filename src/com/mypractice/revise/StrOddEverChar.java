package com.mypractice.revise;

import java.util.Scanner;

public class StrOddEverChar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();

        System.out.println(action(str));
    }

    public static String action(String str) {
        int len = str.length();
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);

            if (i % 2 == 0) {
                ch++;
            } else {
                ch--;
            }

            str = str.substring(0, i) + ch + str.substring(i + 1, len);
        }
        return str;
    }
}
