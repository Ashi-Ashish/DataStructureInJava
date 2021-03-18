package com.mypractice.HackerBlock;

import java.util.Scanner;

public class IsArmstrong {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int num = n;
        int count = 0;

        while (num > 0) {
            num = num / 10;
            count++;
        }
        num = n;
        int res = 0;
        while (n > 0) {
            int r = n % 10;
            n = n / 10;
            res = res + power(r, count);
        }
        if (res == num) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static int power(int r, int count) {
        int x = 1;
        while (count > 0) {
            x = x * r;
            count--;
        }
        return x;
    }
}
