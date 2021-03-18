package com.mypractice.HackerBlock;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        bubble(arr);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void bubble(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                int t;

                if (arr[j] > arr[j + 1]) {
                    t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }

            }

        }
    }
}
