package com.mypractice.HackerBlock;

import java.util.Scanner;

public class OddEvenRec {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        oddEven(n);
    }

    public static void oddEven(int n) {
        if (n == 0) {
            return;
        }
        if (n % 2 == 1) {
            System.out.println(n);
        }
        oddEven(n - 1);
        if (n % 2 == 0) {
            System.out.println(n);
        }
    }
}
