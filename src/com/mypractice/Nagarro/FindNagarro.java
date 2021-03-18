package com.mypractice.Nagarro;

import java.util.Scanner;

//input: aandjagaksrcrov
//output: true


public class FindNagarro {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        String str2 = "nagarro";

        int i = 0;
        int j = 0;

        while (i < str1.length() && j < str2.length()){
            if (str1.charAt(i) == str2.charAt(j)){
                i++;
                j++;
            }else {
                i++;
            }
        }

        if (j == str2.length()){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
