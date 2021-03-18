package com.mypractice.HackerBlock;

import java.util.Scanner;

public class FoundAtLast {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int m = s.nextInt();
        System.out.println(index(arr, m));
    }

    public static int index(int[] arr, int m) {
        int i;
        for (i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == m) {
                return i;
            }
        }
        return -1;
    }
}
