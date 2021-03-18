package com.mypractice.HackerBlock;

import java.util.Scanner;

public class RecConvertStrToInt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        System.out.println(convert(str, 0));
    }

    public static int convert(String str, int num) {
        if (str.isEmpty()) {
            return num;
        }
        char ch = str.charAt(0);

        num = num * 10 + Integer.parseInt(str.substring(0, 1));

        return convert(str.substring(1), num);
    }
}
