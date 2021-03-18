package com.mypractice.HackerBlock;

import java.util.Scanner;

public class RecWhatIsInParenthesis {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        String str = s.nextLine();

        System.out.println(parenthesis(str, builder));

    }

    public static String parenthesis(String str, StringBuilder builder) {
        char ch = str.charAt(0);
        if (ch == ')') {
            builder.deleteCharAt(0);
            return builder.toString();
        }

        if (ch == '(') {
            builder.append('(');
        }
        if (builder.length() > 0 && ch != '(') {
            builder.append(ch);
        }
        return parenthesis(str.substring(1, str.length()), builder);
    }
}
