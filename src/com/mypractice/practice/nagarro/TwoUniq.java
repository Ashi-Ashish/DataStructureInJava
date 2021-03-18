package com.mypractice.practice.nagarro;

import java.util.ArrayList;

public class TwoUniq {
    public static void main(String[] args) {
        String str = "mississippi";
//        maxstr(str,0);
//        String arr[]=longestTwoUniqueCharSubstring(str);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }


    }

    public static int maxstr(String str, int max) {

        char ch1 = str.charAt(0);
        int i = 0;
        while (str.charAt(i) == ch1) {

            i++;
            if (i == str.length()){
                return max;
            }
        }
        char ch2 = str.charAt(i);
        int j = 0;
        int k=0;
        while (j < str.length() && (str.charAt(j) == ch1 || str.charAt(j) == ch2)) {
            if (str.charAt(j)!=str.charAt(k)){
                k=j;
            }
            j++;
        }
        if (j>max){
            max=j;
        }
        int m=maxstr(str.substring(k),max);

        if ( m== j){
            System.out.println(str.substring(0,j)+" ");
        }
        return m;
    }


}

