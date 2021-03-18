package com.mypractice.Assignment_2;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int zero = 0;
        int first = 1;
        int temp;
        int i = 1;

        while (i <= n) {
            temp = first;
            first = zero + first;
            zero = temp;
//            System.out.println(i + "th no. is: " + zero);
            i++;
        }
        System.out.println(i - 1 + "th no. is: " + zero);
    }
}
