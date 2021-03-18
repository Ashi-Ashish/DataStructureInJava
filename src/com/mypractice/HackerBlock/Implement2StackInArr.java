package com.mypractice.HackerBlock;

import java.util.Scanner;

public class Implement2StackInArr {

    private int[] stack;
    private int top1;
    private int top2;

    public Implement2StackInArr(int n) {
        stack = new int[n];
        top1 = -1;
        top2 = stack.length;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        Implement2StackInArr p = new Implement2StackInArr(n);

        for (int i = 0; i < n1; i++) {
            p.push1(s.nextInt());
        }


        for (int i = p.stack.length - 1; i > p.stack.length - n2 - 1; i--) {
            p.push2(s.nextInt());
        }

        if (!p.isEmpty1()) {
            System.out.println(p.pop1());
        }

        if (!p.isEmpty2()) {
            System.out.println(p.pop2());
        }

        p.display1();
        p.display2();
    }


    public void push1(int value) {
        stack[++top1] = value;
    }

    public void push2(int value) {
        stack[--top2] = value;
    }

    public int pop1() {

        int val = stack[top1];
        top1--;
        return val;
    }

    public int pop2() {

        int val = stack[top2];
        top2++;
        return val;
    }

    public boolean isEmpty1() {
        return top1 == -1;
    }

    public boolean isEmpty2() {
        return top2 == stack.length;
    }

    public void display1() {

        System.out.println("Elements in stack1 are");

        if (isEmpty1()) {
            System.out.println("None");
        } else {
            while (!isEmpty1()) {
                System.out.println(pop1() + " ");
            }
        }
    }

    public void display2() {

        System.out.println("Elements in stack2 are");

        if (isEmpty2()) {
            System.out.print("None");
        } else {
            while (!isEmpty2()) {
                System.out.print(pop2() + " ");
            }
        }
    }
}
