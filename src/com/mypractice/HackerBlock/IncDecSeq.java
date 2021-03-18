package com.mypractice.HackerBlock;

import java.util.Scanner;

public class IncDecSeq {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();


        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int i = 0;

        while (i < n - 1) {
            if (arr[i] > arr[i + 1]) {
                i++;
            } else if (arr[i] == arr[i + 1]) {
                System.out.println(false);
                return;
            } else {
                break;
            }
        }

        while (i < n - 1) {
            if (arr[i] < arr[i + 1]) {
                i++;
            } else if (arr[i] == arr[i + 1]) {
                System.out.println(false);
                return;
            } else {
                break;
            }
        }
        if (i == n - 1) {
            System.out.println(true);
            return;
        } else {
            System.out.println(false);
            return;
        }
    }
}
