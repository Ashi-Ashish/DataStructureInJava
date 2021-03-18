package com.mypractice.HackerBlock;

import java.util.Arrays;
import java.util.Scanner;

public class RecKeypad {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        Scanner s = new Scanner(System.in);
        char arr[][] = {{'a', 'b', 'c'},
                {'d', 'e', 'f'},
                {'g', 'h', 'i'},
                {'j', 'k', 'l'},
                {'m', 'n', 'o'},
                {'p', 'q', 'r', 's'},
                {'t', 'u', 'v'},
                {'w', 'x'},
                {'y', 'z'}};

        String str = s.nextLine();
        int x = (keypad(arr, str, builder));
        System.out.println("\n" + x);
    }

    public static int keypad(char[][] arr, String str, StringBuilder builder) {

        int count = 0;
        if (str.isEmpty()) {
            System.out.print(builder + " ");
            builder.deleteCharAt(builder.length() - 1);
            return 1;
        }
        int x = Integer.parseInt(str.substring(0, 1)) - 1;
        for (int col = 0; col < arr[x].length; col++) {
            builder.append(arr[x][col]);
            count += keypad(arr, str.substring(1), builder);
        }
        builder.delete(0, builder.length());

        return count;
    }

}
