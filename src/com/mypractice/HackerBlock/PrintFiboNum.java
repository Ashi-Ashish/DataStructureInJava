package com.mypractice.HackerBlock;

import java.util.Scanner;

public class PrintFiboNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        fibo(n);
    }

    public static void fibo(int n) {

        int first = 0;
        int second = 1;
        System.out.println(first);
        while (second <=  n) {
            int temp = first;
            first = second;
            second = temp + second;
            System.out.println(first);
        }
    }
}
