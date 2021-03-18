package com.mypractice.HackerBlock;

import java.util.Scanner;

public class StringSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = s.next();
        }

        for (int loop = 0; loop < n - 1; loop++) {

            for (int i = 0; i < n - loop - 1; i++) {

                int j;
                for (j = 0; j < str[i].length() && j < str[i + 1].length(); j++) {
                    if (str[i].charAt(j) > str[i + 1].charAt(j)) {

                        String temp = str[i];
                        str[i] = str[i + 1];
                        str[i + 1] = temp;
                        break;
                    } else if (str[i].charAt(j) == str[i + 1].charAt(j)) {
                        continue;
                    } else {
                        break;
                    }
                }
                if (j == str[i].length() || j == str[i + 1].length()) {
                    if (str[i].length() < str[i + 1].length()) {
                        String temp = str[i];
                        str[i] = str[i + 1];
                        str[i + 1] = temp;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(str[i]);
        }

    }
}
