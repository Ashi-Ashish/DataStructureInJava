package com.mypractice.HackerBlock;

import java.util.Scanner;

public class nthFibo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int first = 0;
        int second = 1;

        for (int i = 2; i <= n; i++) {
            int t = first;
            first = second;
            second = t + second;
        }
        System.out.println(second);
    }
}
