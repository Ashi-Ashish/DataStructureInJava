package com.mypractice.HackerBlock;

import java.util.*;

public class Example {
    public static void main(String args[])
    {
        // Creating an empty Stack
        Stack<Integer> STACK = new Stack<Integer>();

        // Use push() to add elements into the Stack
        STACK.push(10);
        STACK.push(15);
        STACK.push(30);
        STACK.push(20);
        STACK.push(5);

        // Displaying the Stack
        System.out.println("Initial Stack: " + STACK);

        // Fetching the element at the head of the Stack
        System.out.println("The element at the top of the"
                + " stack is: " + STACK.peek());

        // Displaying the Stack after the Operation
        System.out.println("Final Stack: " + STACK);
    }
}