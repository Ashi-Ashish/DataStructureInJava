package com.mypractice.HackerBlock;

import java.util.ArrayList;
import java.util.Scanner;

public class RecAllSubseq {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int k = 0; k < n; k++) {
            String unprocessed = s.next();
            String processed = "";

            ArrayList<String> str = new ArrayList<>();

            str = subseq(processed, unprocessed, str);
            String[] arr = new String[str.size()];

            for (int i = 0; i < str.size(); i++) {
                arr[i] = str.get(i);
            }
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    int value = arr[j].compareTo(arr[j + 1]);
                    if (value > 0) {
                        String temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }

        }
    }


    public static ArrayList<String> subseq(String processed, String unprocessed, ArrayList<String> str) {
        if (unprocessed.isEmpty()) {
            str.add(processed);
            return str;
        }
        char ch = unprocessed.charAt(0);

        subseq(processed, unprocessed.substring(1), str);
        subseq(processed + ch, unprocessed.substring(1), str);

        return str;
    }
}