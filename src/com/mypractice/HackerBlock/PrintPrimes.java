package com.mypractice.HackerBlock;

import java.util.Scanner;

public class PrintPrimes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        StringBuilder builder = new StringBuilder();

        for (int num = 2; num <= n; num++) {
            int j;

            for (j = 2; j * j <= num; j++) {
                if (num % j == 0) {
                    break;
                }
            }

            if (j * j > num) {
                if (builder.length() > 0) {
                    builder.append(", ");
                }
                builder.append(num);
            }
        }
        System.out.println(builder);
    }
}
