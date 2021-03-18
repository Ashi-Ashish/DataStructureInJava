package com.mypractice.HackerBlock;

import java.util.Scanner;

public class StringPallin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(pallin(str));
    }

    public static Boolean pallin(String str) {

        int i = 0;
        while (i < str.length() - i - 1) {

            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
            i++;
        }
        return true;
    }
}
