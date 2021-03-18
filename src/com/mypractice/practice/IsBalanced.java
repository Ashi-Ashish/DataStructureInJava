package com.mypractice.practice;

import java.util.Scanner;

public class IsBalanced {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        StringBuilder builder = new StringBuilder();

        System.out.println(rec(str, builder));


    }


    public static boolean rec(String str, StringBuilder builder) {

        if (str.isEmpty()) {
            if (builder.length() == 0) {
                return true;
            } else {
                return false;
            }
        }

        char ch = str.charAt(0);

        if ((ch == '(') || (ch == '{') || (ch == '[')) {
            builder.append(ch);
        }
        if ((ch == ')') && (builder.charAt(builder.length() - 1) == '(') || (ch == '}') && (builder.charAt(builder.length() - 1) == '{') || (ch == ']') && (builder.charAt(builder.length() - 1) == '[')) {
            builder.deleteCharAt(builder.length() - 1);
        }

        return rec(str.substring(1), builder);


    }
}
