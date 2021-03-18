package com.mypractice.HackerBlock;

import java.util.Scanner;

public class CheckFibo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int first = 0;
        int second = 1;
        int temp;

        while (second < n) {
            temp = second;
            second = first + second;
            first = temp;

        }
        if (second == n) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
