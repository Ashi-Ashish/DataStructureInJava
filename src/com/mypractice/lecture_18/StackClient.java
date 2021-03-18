package com.mypractice.lecture_18;

public class StackClient {
    public static void main(String[] args) throws Exception {
        Stack stack = new DynamicStack();

        stack.push(34);
        stack.push(35);
        stack.push(36);
        stack.push(37);
        stack.push(38);
        stack.push(39);

        try {
            System.out.println(stack.pop());
            System.out.println(stack.pop());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(stack.toString());
    }
}
