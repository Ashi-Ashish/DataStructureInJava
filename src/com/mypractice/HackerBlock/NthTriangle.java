package com.mypractice.HackerBlock;

import java.util.Scanner;

public class NthTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        nth(n, 1, 1);
    }

    public static void nth(int n, int num, int count) {

        if (n == count) {
            System.out.println(num);
            return;
        }

        count++;
        num = num + count;
        nth(n, num, count);
        return;
    }
}
