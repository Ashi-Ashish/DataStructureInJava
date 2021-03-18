package com.mypractice.Nagarro;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//input: foooot
//output: fot


public class RemoveChar {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        String str = s.nextLine();

        Set<Character> set = new HashSet<Character>();

        for (int i = 0; i < str.length(); i++) {

            if (!set.contains(str.charAt(i))){
                builder.append(str.charAt(i));
                set.add(str.charAt(i));
            }
        }

        System.out.println(builder.toString());
    }
}
