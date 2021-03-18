package com.mypractice.lecture_6;

import java.util.Scanner;

public class Pallin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int left,right,count=0;
        String str = s.nextLine();

        for (int i = 0; i < str.length(); i++) {
            left = i;
            right = i;
            while( left >= 0 && right < str.length()){
                if(str.charAt(left) == str.charAt(right)){
                    count++;
                }
                else{
                    break;
                }
                left--;
                right++;
            }
        }

        for (int i = 0; i < str.length(); i++) {
            left = i;
            right = i+1;
            while( left >= 0 && right < str.length()){
                if(str.charAt(left) == str.charAt(right)){
                    count++;
                }
                else{
                    break;
                }
                left--;
                right++;
            }
        }
        System.out.println(count);
    }
}

