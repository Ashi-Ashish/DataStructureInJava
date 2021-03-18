package com.mypractice.revise;

import java.util.*;
public class CountPalin {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String str = s.next();

        int left;
        int right;
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            left = i;
            right = i;

            while (left >= 0 && right < str.length()){
                if (str.charAt(left) == str.charAt(right)){
                    count++;
                    left--;
                    right++;
                } else {
                    break;
                }
            }

            left = i;
            right = i + 1;

            while (left >= 0 && right < str.length()){
                if (str.charAt(left) == str.charAt(right)){
                    count++;
                    left--;
                    right++;
                } else {
                    break;
                }
            }
        }
        System.out.println(count);
    }
}

