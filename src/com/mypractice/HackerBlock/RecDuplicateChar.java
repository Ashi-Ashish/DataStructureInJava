package com.mypractice.HackerBlock;

import java.util.Scanner;

public class RecDuplicateChar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String string = s.nextLine();
        StringBuilder builder = new StringBuilder();

        System.out.println(duplicate(string, builder));
    }

    public static String duplicate(String string, StringBuilder builder) {

        if (string.isEmpty()) {
            return builder.toString();
        }
        if (string.length() == 1) {
            builder.append(string);
            return builder.toString();
        }

        if (string.charAt(0) == string.charAt(1)) {
            builder.append(string.charAt(0) + "*");
        } else {
            builder.append(string.charAt(0));
        }

        duplicate(string.substring(1), builder);
        return builder.toString();
    }
}
