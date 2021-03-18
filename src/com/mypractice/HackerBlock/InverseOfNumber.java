package com.mypractice.HackerBlock;

import java.util.Scanner;

public class InverseOfNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int num = 0;
        int i = 1;
        while (n > 0) {
            int r = n % 10;
            n = n / 10;
            num = num + i * power(r);
            i++;
        }
        System.out.println(num);
    }

    public static int power(int x) {
        int m = 1;
        for (int i = 0; i < x - 1; i++) {
            m = m * 10;
        }
        return m;
    }
}
