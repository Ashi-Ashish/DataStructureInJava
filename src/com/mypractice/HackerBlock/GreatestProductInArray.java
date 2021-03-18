package com.mypractice.HackerBlock;

import java.util.Arrays;
import java.util.Scanner;

public class GreatestProductInArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr);
        int max = arr[n - 1];
        System.out.println(greatest(arr, max));

    }

    public static int greatest(int[] arr, int max) {
        int big = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] * arr[j] > max) {
                    break;
                } else {
                    big = loop(arr, arr[i] * arr[j], big);
                }
            }
        }
        if (big==0){
            return -1;
        }else {
            return big;
        }
    }

    public static int loop(int[] arr, int num, int big) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num && num > big) {
                big = arr[i];
            }
        }
        return big;
    }
}
