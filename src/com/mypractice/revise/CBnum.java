package com.mypractice.revise;

import java.util.Scanner;

public class CBnum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String up = s.next();
        String p = "";


                       int[] arr={2,3,5,7,11,13,17,19,23,29};

        System.out.println(check(up,p,arr));

    }


    public static int check(String up, String p , int[] arr) {

        if (up.isEmpty()){

            if (p.length() == 0){
                return 0;
            }
            for (int i = 0; i < arr.length; i++) {
                if (Integer.parseInt(p) % arr[i] == 0){
                    return 0;
                }
            }
            return 1;
        }
        int sum = 0;
        char ch = up.charAt(0);

        sum += check(up.substring(1),p+ch,arr);
        sum += check(up.substring(1),p,arr);

        return sum;

    }
}
