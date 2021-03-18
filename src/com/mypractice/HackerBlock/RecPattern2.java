package com.mypractice.HackerBlock;

import java.util.Scanner;

public class RecPattern2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        pattern(n, n);
    }

    public static void pattern(int n, int count) {
        if (count == 0) {
            return;
        }
        for (int i = count; i > 0; i--) {
            System.out.print("* ");
        }
        System.out.println();
        count--;
        pattern(n, count);
        return;
    }
}
