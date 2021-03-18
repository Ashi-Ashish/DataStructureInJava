package com.mypractice.practice;

import java.util.Scanner;

public class KeyPad {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        String str = s.nextLine();
        String [] arr = { "","abc", "def","ghi", "jkl", "mno", "pqrs", "tuv", "wx", "yz"};

        word(str, arr, builder);


    }

    private static void word(String str, String[] arr, StringBuilder builder) {

        if (str.isEmpty()){
            return;
        }


        for (int i = 0; i < arr[str.charAt(1)].length(); i++) {

//            builder.append()

        }

    }
}
