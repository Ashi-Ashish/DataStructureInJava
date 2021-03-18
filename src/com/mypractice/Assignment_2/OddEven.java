package com.mypractice.Assignment_2;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        int n= s.nextInt();

        int even=0;
        int odd=0;
        int rev=0;
        int r;

       /* while (n>0){
            r=n%10;
            n=n/10;
            rev=(rev*10)+r;
        }*/

        while (rev>0){

            odd=odd+(rev%10);
            rev=rev/10;

            even=even+(rev%10);
            rev=rev/10;
        }
        System.out.println("sum of odd digits="+odd);
        System.out.println("sum of even digits="+even);
    }
}
