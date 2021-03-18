package com.mypractice.Duplicate;

import java.util.Scanner;

public class FindNumArr {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int m = s.nextInt();
        boolean ans = present(arr, m, 0);
        if (ans == true) {
            System.out.print(m);
        } else {
            System.out.print("false");
        }
    }

    public static boolean present(int[] arr, int m, int index) {
        if (index == arr.length) {
            return false;
        }

        if (arr[index] == m) {
            return true;
        } else {
            index++;
            return present(arr, m, index);
        }
    }
}