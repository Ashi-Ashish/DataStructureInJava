package com.mypractice.revise;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        StringBuilder builder = new StringBuilder();
        builder.length();
        System.out.println(dup(str, builder));
    }


    public static String dup(String str, StringBuilder builder) {
        if (str.isEmpty()) {
            return builder.toString();
        }


        if (builder.toString().isEmpty()) {
            builder.append(str.charAt(0));
            dup(str.substring(1), builder);
        } else if (str.charAt(0) == builder.toString().charAt(builder.length() - 1)) {
            builder.append('*');
            builder.append(str.charAt(0));
            dup(str.substring(1), builder);
        } else {
            builder.append(str.charAt(0));
            dup(str.substring(1), builder);
        }
        return builder.toString();
    }
}
