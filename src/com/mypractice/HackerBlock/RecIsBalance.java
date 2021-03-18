package com.mypractice.HackerBlock;

import java.util.Scanner;

public class RecIsBalance {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        StringBuilder builder = new StringBuilder();
        System.out.println(bracket(str, builder));

    }

    public static boolean bracket(String str, StringBuilder builder) {

        if (str.isEmpty()) {
            if (builder.length() == 0) {
                return true;                       //true
            } else {
                return false;                       //false
            }
        }

        char ch = str.charAt(0);

        if ((ch == '[') || (ch == '{') || (ch == '(')) {
            builder.append(ch);
        }

        if ((ch == ']') && (builder.charAt(builder.length() - 1) == '[')) {
            builder.deleteCharAt(builder.length() - 1);
        } else if ((ch == ']') && (builder.charAt(builder.length() - 1) != '[')) {
            return false;
        }

        if ((ch == '}') && (builder.charAt(builder.length() - 1) == '{')) {
            builder.deleteCharAt(builder.length() - 1);
        } else if ((ch == '}') && (builder.charAt(builder.length() - 1) != '{')) {
            return false;
        }

        if ((ch == ')') && (builder.charAt(builder.length() - 1) == '(')) {
            builder.deleteCharAt(builder.length() - 1);
        } else if ((ch == ')') && (builder.charAt(builder.length() - 1) != '(')) {
            return false;
        }

        return bracket(str.substring(1), builder);
    }
}
