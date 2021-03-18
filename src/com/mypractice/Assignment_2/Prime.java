package com.mypractice.Assignment_2;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 2;

        while (i*i <= n ) {

            if (n % i == 0) {

                System.out.println("Not Prime");
                return;
            }
            i = i + 1;
        }
        System.out.println("Prime");
    }
}