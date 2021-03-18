package com.mypractice.HackerBlock;

import java.util.Scanner;

public class StringMaxFreqChar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();

        System.out.println(freq(str));


    }

    public static char freq(String str) {

        int[] arr = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int index = (char) (ch - 'a');
            arr[index] = arr[index] + 1;
        }

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }

        return (char) ('a' + max);
    }
}
