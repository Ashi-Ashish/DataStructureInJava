package com.mypractice.lecture_16;

public class StackClient {
    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push(22);
        stack.push(2);
        stack.push(44);
        stack.pop();
        stack.push(66);
        stack.push(3);
        stack.pop();
        stack.push(90);
        stack.display();
    }
}
