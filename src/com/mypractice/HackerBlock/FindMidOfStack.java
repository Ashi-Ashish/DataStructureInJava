package com.mypractice.HackerBlock;

import java.util.Scanner;
import java.util.Stack;

public class FindMidOfStack {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            stack.push(s.nextInt());
        }
        System.out.println(findMid(stack, n));
    }

    public static int findMid(Stack<Integer> stack, int n) {

        for (int i = 0; i < n / 2; i++) {

            stack.pop();
        }
        return stack.pop();
    }
}
