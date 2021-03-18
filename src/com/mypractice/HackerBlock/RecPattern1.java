package com.mypractice.HackerBlock;

import java.util.Scanner;

public class RecPattern1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        pattern(n, 0);
    }

    public static void pattern(int n, int count) {
        if (n == count) {
            return;
        }
        for (int i = 0; i <= count; i++) {
            System.out.print("* ");
        }
        System.out.println();
        count++;
        pattern(n, count);
        return;
    }
}
