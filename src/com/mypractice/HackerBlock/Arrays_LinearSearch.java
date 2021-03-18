package com.mypractice.HackerBlock;

import java.util.Scanner;

public class Arrays_LinearSearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int m = s.nextInt();

        int x=linearSearch(arr, m);
        System.out.println(x);
    }

    public static int linearSearch(int[] arr, int m) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == m) {

                return i;
            }

        }
        return -1;
    }
}
