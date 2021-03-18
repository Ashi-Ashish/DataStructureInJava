package com.mypractice.revise;

import java.util.Arrays;
import java.util.Scanner;

public class StringSort {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.next();
        }

//        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        for (int k = 0; k < arr.length-1; k++) {
            for (int i = 0; i < arr.length - 1 - k; i++) {
                int j;
                for (j = 0; j < arr[i].length() && j < arr[i + 1].length(); j++) {

                    if (arr[i].charAt(j) > arr[i + 1].charAt(j)) {

                        String temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                        break;
                    } else if (arr[i].charAt(j) < arr[i + 1].charAt(j)){
                        break;
                    }

                }
                if (j == arr[i].length()) {
                    String temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
