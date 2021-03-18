package com.mypractice.HackerBlock;

import java.util.Scanner;

public class DelhiOddEven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            int num = s.nextInt();
            int even = 0;
            int odd = 0;

            while (num > 0) {
                int r = num % 10;
                num = num / 10;

                if (r % 2 == 0) {
                    even = even + r;
                } else {
                    odd = odd + r;
                }
            }
            if (even % 4 == 0 || odd % 3 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
