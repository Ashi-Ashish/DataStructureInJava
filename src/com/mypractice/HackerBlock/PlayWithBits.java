package com.mypractice.HackerBlock;

import java.util.Scanner;

public class PlayWithBits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            int count = 0;
            int n1 = s.nextInt();
            int n2 = s.nextInt();

            for (int j = n1; j <= n2; j++) {
                count = count + count(decToBin(j));
            }
            System.out.println(count);
        }
    }

    public static int decToBin(int n) {
        int res = 0;
        int i = 0;
        while (n > 0) {
            int r = n % 2;
            n = n / 2;
            res = res + r * power(i, 10);
            i++;
        }
        return res;
    }


    public static int power(int i, int base) {
        int x = 1;
        for (int j = 0; j < i; j++) {
            x = x * base;
        }
        return x;
    }

    public static int count(int num) {

        int count = 0;
        while (num > 0) {
            int r = num % 10;
            num = num / 10;
            if (r == 1) {
                count++;
            }
        }
        return count;
    }
}
