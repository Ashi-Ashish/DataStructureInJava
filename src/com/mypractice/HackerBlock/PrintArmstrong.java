package com.mypractice.HackerBlock;

import java.util.Scanner;

public class PrintArmstrong {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();

        for (int i = n1; i <= n2; i++) {

            int num = i;
            int count = 0;

            while (num > 0) {
                num = num / 10;
                count++;
            }
            num = i;
            int res = 0;
            while (num > 0) {
                int r = num % 10;
                num = num / 10;
                res = res + power(r, count);
            }
            if (res == i) {
                System.out.println(res);
            }
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
