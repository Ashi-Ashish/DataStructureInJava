package com.mypractice.Nagarro;

import java.util.HashSet;
import java.util.Set;

public class Consicutive {
    public static void main(String[] args) {
        int [] arr1 = {2,4,5,7,8,14,78};
        int [] arr2 = {3,5,7,8,9,78};
//        HashMap<Integer, Integer> map = new HashMap<>();

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
//            map.put(arr1[i], 0);
            set.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i]-1)){
                System.out.println((arr2[i]-1) + " " +arr2[i] );
            }

            if (set.contains(arr2[i]+1)){
                System.out.println(arr2[i] + " " +(arr2[i]+1) );
            }

        }

    }
}
