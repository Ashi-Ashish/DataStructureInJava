package com.mypractice.Nagarro;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class NoDuplicateString {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Yadwinder");
        names.add("Sunny");
        names.add("Jagga");
        names.add("Yadwinder");
        Set<String> s = new HashSet<>();
        for (String name : names) {

            if (s.add(name) == false) {
                System.out.print(name + " ");
            }

        }
    }
}