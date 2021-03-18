package com.mypractice.HackerBlock;

import java.util.Scanner;
        import java.util.Stack;

public class StackDuplicateParenthesis {
    public Stack<Character> stack = new Stack<Character>();

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n=s.nextInt();

        for (int i = 0; i < n; i++) {
            String str = s.next();
            StackDuplicateParenthesis obj = new StackDuplicateParenthesis();
            if (obj.duplicate(str)) {
                System.out.println("No Duplicates Found");
            } else {
                System.out.println("Duplicate Found");
            }
        }

    }

    public boolean duplicate(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ')') {
                if (stack.peek() == '(') {
                    return false;
                }
                while (stack.peek() != '(') {
                    stack.pop();
                }
                stack.pop();

            } else {
                stack.push(str.charAt(i));
            }
        }

        return true;
    }
}
