package com.mypractice.revise;

import java.util.Scanner;

public class FiboRec {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println(fibo(n, 0, 1, 2));
    }

    private static int fibo(int n, int first, int second, int count) {
        if (n <= 1) {
            return n;
        }
        if (count > n) {
            return second;
        }
        count++;
        return fibo(n, second, first + second, count);
    }
}
