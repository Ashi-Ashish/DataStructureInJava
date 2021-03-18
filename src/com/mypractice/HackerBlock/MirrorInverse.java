package com.mypractice.HackerBlock;

import java.util.Scanner;

public class MirrorInverse {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            arr2[val] = i;
        }
        inverse(arr, arr2);
    }

    public static int inverse(int[] arr, int[] arr2) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr2[i]) {
            } else {
                System.out.println("false");
                return -1;
            }
        }
        System.out.println("true");
        return 0;
    }
}

