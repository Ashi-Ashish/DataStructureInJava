package com.mypractice.HackerBlock;

import java.util.Scanner;

public class MaxVal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int m = max(arr);
        System.out.println(m);
    }

    public static int max(int[] arr) {
        int m = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > m) {
                m = arr[i];
            }
        }
        return m;
    }
}
