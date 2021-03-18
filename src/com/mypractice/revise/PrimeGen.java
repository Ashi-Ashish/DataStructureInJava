package com.mypractice.revise;

import java.util.Scanner;

public class PrimeGen {
    public static void main(String[] args) {
        Scanner s = new Scanner((System.in));
        int t = s.nextInt();

        for (int k = 0; k < t; k++) {
            int n1 = s.nextInt();
            int n2 = s.nextInt();

            for (int i = n1; i <= n2; i++) {

                if (i == 1) {
                    continue;
                }
                int j = 2;
                while (j * j <= i) {
                    if (i % j == 0) {
                        break;
                    }
                    j++;
                }
                if (j * j > i) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }


    }
}
