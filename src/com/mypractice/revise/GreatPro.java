package com.mypractice.revise;

import java.util.Arrays;
import java.util.Scanner;

public class GreatPro {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr);
        int max = arr[n-1];
        System.out.println(greatPro(arr, max));
    }


    public static boolean check(int num, int[] arr, int pnum) {

        for (int i = 0; i < arr.length; i++) {

            if (num == arr[i] && num > pnum) {
                return true;
            }
        }
        return false;
    }


    public static int greatPro(int[] arr, int max) {
        int num = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] * arr[j] <= max) {
                    if (check(arr[i] * arr[j], arr, num)) {
                        num = arr[i] * arr[j];
                    }
                } else {
                    break;
                }
            }
        }
        return num;
    }
}