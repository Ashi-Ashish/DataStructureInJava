package com.mypractice.lecture_1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        System.out.println("Enter Year");
        Scanner s = new Scanner(System.in);

        int year = s.nextInt();

        if (year % 4 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }

    }
}