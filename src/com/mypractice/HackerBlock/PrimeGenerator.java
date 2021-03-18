package com.mypractice.HackerBlock;

import java.util.Scanner;

public class PrimeGenerator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        for (int i = 0; i < t; i++) {
            int m = s.nextInt();
            int n = s.nextInt();
            prime(m, n);
            System.out.println();
        }
    }


    public static void prime(int m, int n) {
        if (m < 2) {
            m = 2;
        }
        for (int num = m; num <= n; num++) {
            int j;

            for (j = 2; j * j <= num; j++) {

                if (num % j == 0) {
                    break;
                }
            }
            if (j * j > num) {
                System.out.print(num + " ");
            }
        }
    }
}
