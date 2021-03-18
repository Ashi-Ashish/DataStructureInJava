package com.mypractice.Nagarro;


import java.util.Scanner;

public class CapitalChar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        StringBuilder builder = new StringBuilder();
        String [] arr = str.split(" ");



        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i].charAt(0);
            if (ch >= 'a' && ch <= 'z'){
                ch = Character.toUpperCase(ch);
                builder.append(ch + arr[i].substring(1).toLowerCase() +" ");
            }
        }

        System.out.println(builder.toString());


    }
}
