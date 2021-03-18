package com.mypractice.HackerBlock;

import java.util.Scanner;

public class BinaryToDec {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int res = n % 10;
        n = n / 10;
        int i = 1;
        while (n > 0) {
            int r = n % 10;
            n = n / 10;
            res = res + r * power(i);
            i++;
        }
        System.out.println(res);
    }

    public static int power(int i) {
        int x = 1;
        for (int j = 0; j < i; j++) {
            x = x * 2;
        }
        return x;
    }
}
