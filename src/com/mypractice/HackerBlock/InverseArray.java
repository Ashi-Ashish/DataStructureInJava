package com.mypractice.HackerBlock;

import java.util.Scanner;

public class InverseArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] arr = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        Inverse(arr, arr2);
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

    public static void Inverse(int[] arr, int[] arr2) {

        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            arr2[val] = i;
        }
    }
}
