package com.mypractice.HackerBlock;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 3; i++) {
            int t = s.nextInt();
            if (t > max) {
                max = t;
            }
        }
        System.out.println(max);
    }
}