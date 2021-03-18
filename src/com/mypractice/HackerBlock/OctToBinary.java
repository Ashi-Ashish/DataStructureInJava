package com.mypractice.HackerBlock;

import java.util.Scanner;

public class OctToBinary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        octToDec(n);

    }

    public static int power(int i, int base) {
        int x = 1;
        for (int j = 0; j < i; j++) {
            x = x * base;
        }
        return x;
    }

    public static void octToDec(int n) {

        int res = 0;
        int i = 0;
        while (n > 0) {
            int r = n % 10;
            n = n / 10;
            res = res + r * power(i, 8);
            i++;
        }
        System.out.println(res);
        decToBin(res);
    }

    public static void decToBin(int n) {
        int res = 0;
        int i = 0;
        while (n > 0) {
            int r = n % 2;
            n = n / 2;
            res = res + r * power(i, 10);
            i++;

        }
        System.out.println(res);
    }
}
