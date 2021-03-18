package com.mypractice.HackerBlock;

import java.util.Scanner;

public class ArrayContains {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int m = s.nextInt();

        checkNumber(arr, m);

    }

    public static int checkNumber(int[] arr, int m) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == m) {
                System.out.println("true");
                return 0;
            }
        }
        System.out.println("false");
        return -1;
    }
}
