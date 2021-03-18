package com.mypractice.HackerBlock;

import java.util.Scanner;

public class CountSetBits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            int num = s.nextInt();
            System.out.println(setBit(num));
        }
    }

    public static int setBit(int num) {
        int count = 0;
        while (num > 0) {
            if ((num & 1) == 1) {
                count++;
            }
            num = num >> 1;
        }
        return count;
    }
}
