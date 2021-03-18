package com.mypractice.HackerBlock;

import java.util.Scanner;

public class PrintReverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println(reverse(n));
    }

    public static int reverse(int n) {

        int result = 0;
        while (n > 0) {
            int r = n % 10;
            n = n / 10;
            result = (result * 10) + r;
        }

        return result;
    }
}
