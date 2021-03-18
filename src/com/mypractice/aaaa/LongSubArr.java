package com.mypractice.aaaa;

import java.util.Scanner;

public class LongSubArr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int k = 0; k < t; k++) {


            int n = s.nextInt();
            int[] arr = new int[n];
            int max = -1;
            for (int j = 0; j < n; j++) {
                arr[j] = s.nextInt();
            }

            for (int i = 0; i < arr.length - 1; i++) {


                int sum = 0;
                for (int j = i; j < n; j++) {
                    sum = sum + arr[j];
                    if (sum > 0 && max < j - i) {
                        max = j - i + 1;
                    }
                }


            }

            System.out.println(max);


        }
    }
}
