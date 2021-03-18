package com.mypractice.HackerBlock;

import java.util.Scanner;

public class DecToOct {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        decToOct(n);
    }

    public static void decToOct(int n) {
        int res = 0;
        int i = 0;
        while (n > 0) {
            int r = n % 8;
            n = n / 8;
            res = res + r * power(i, 10);
            i++;

        }
        System.out.println(res);
    }

    public static int power(int i, int base) {
        int x = 1;
        for (int j = 0; j < i; j++) {
            x = x * base;
        }
        return x;
    }
}
