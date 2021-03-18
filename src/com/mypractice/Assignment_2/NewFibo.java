package com.mypractice.Assignment_2;

import java.util.Scanner;

public class NewFibo {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int zero = 0;
        int first = 1;
        int temp;
        int i = 1;
        while (first < n) {
            temp = first;
            first = zero + first;
            zero = temp;
            System.out.println(i + "th no. is: " + zero);
            i++;
        }
    }
}
