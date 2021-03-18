package com.mypractice.HackerBlock;

import java.util.Scanner;

public class InterestingPrime {
    public static int count = 0;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();

        check(n, 0);
    }

    private static boolean check(long n, int digit) {
        if (n == 1) {
            return false;
        }
        if (n == 0) {
            System.out.println(digit);
            return true;
        }
        long count = 0;
        for (long i = n; i > 1; i--) {
            if (isPrime(i)) {
                digit++;
                if (check(count, digit)) {
                    return true;
                }
                digit--;
            }
            count++;
        }
        return false;
    }

    public static boolean isPrime(long n) {

        long j;

        for (j = 2; j * j <= n; j++) {

            if (n % j == 0) {
                break;
            }
        }
        if (j * j > n) {
            return true;
        }

        return false;
    }

}