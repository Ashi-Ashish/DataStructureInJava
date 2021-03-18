package com.mypractice.HackerBlock;

import java.util.ArrayList;
import java.util.Scanner;

public class StackGetMin {
    ArrayList<Integer> stack;
    int top;

    public void StackGetMin() {
        this.stack = new ArrayList<>();
        top = -1;
    }


    int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        StackGetMin o = new StackGetMin();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            o.push(s.nextInt());
        }
        System.out.println(o.min());
    }


    public int min() {
        return min;
    }


    public void push(int num) {
        if (num < min) {
            min = num;
        }
        top++;

        return;
    }
}