package com.mypractice.HackerBlock;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        insertion(arr);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void insertion(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j > 0; j--) {

                int t;

                if (arr[j] < arr[j - 1]) {
                    t = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = t;
                } else {
                    break;
                }
            }
        }
    }
}

