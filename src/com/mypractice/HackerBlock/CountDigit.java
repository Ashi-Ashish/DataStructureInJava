package com.mypractice.HackerBlock;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int digit = s.nextInt();

        int x = 0;
        while (n > 0) {
            int r = n % 10;
            if (r == digit) {
                x++;
            }
            n = n / 10;
        }
        System.out.println(x);
    }
}
