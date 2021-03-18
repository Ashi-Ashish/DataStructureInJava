package com.mypractice.lecture_11;

import java.util.ArrayList;

public class ReturnList {
    public static void main(String[] args) {
////        ArrayList<String> list = new ArrayList<>();
//        String processed = "";
//        String unprocessed = "abc";
//        subseq(processed, unprocessed, list);
//        System.out.println(list);

//        System.out.println(subseq2("","abc"));
        System.out.println(dice("",3));
    }

    public static void subseq(String processed, String unprocessed, ArrayList<String> list) {

        if (unprocessed.isEmpty()) {
            if (!processed.isEmpty()) {
                list.add(processed);
            }
            return;
        }
        char ch = unprocessed.charAt(0);

        unprocessed = unprocessed.substring(1);

        subseq(processed + ch, unprocessed, list);
        subseq(processed, unprocessed, list);
    }
public static ArrayList subseq2(String processed, String unprocessed) {

        if (unprocessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            if (!processed.isEmpty()) {
                list.add(processed);
            }
            return list;
        }
        char ch = unprocessed.charAt(0);

        unprocessed = unprocessed.substring(1);

        ArrayList<String> list = new ArrayList<>();
        list.addAll(subseq2(processed + ch, unprocessed));
        list.addAll(subseq2(processed, unprocessed));
        return list;
    }

    public static ArrayList<String> dice(String processed, int target) {
        if (target == 0) {
            ArrayList<String> list=new ArrayList<>();
            list.add(processed);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(dice(processed + i, target - i));
        }
        return list;
    }
}


