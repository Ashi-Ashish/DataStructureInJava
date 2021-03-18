package com.mypractice.Assignment_2;

import java.util.Scanner;

public class NewPrime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();

        int n = 2;

        while (n <= m) {

            boolean x = false;
            int i = 2;

            while (i <= n / 2) {

                if (n % i == 0) {

                    x = true;
                }

                i++;
            }

            if (x == false) {
                System.out.println(n);
            }

            n++;
        }
    }
}
