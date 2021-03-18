package com.mypractice.Assignment_2;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int res = 0;
        int r;

        while (n > 0) {

            r = n % 10;
            n = n / 10;
            res = (res * 10) + r;
        }
        System.out.print(res);
    }
}