package com.mypractice.HackerBlock;

import java.util.Scanner;

public class UniqueNumber {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int result = 0;
        for (int i = 0; i < n; i++) {
            result = result ^ arr[i];
        }
        System.out.println(result);
    }
}
