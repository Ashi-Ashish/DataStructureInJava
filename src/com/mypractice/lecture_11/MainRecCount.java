package com.mypractice.lecture_11;

import java.util.HashSet;
import java.util.Set;

public class MainRecCount {
    public static void main(String[] args) {
        String processed="";
        String unprocessed="aba";

        Set<String> set=new HashSet<>();

        System.out.println(subseqUnique(processed,unprocessed,set));
    }

    public static int subseq(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            return 1;
        }
        char ch= unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);

        int sum=0;

        sum+=subseq(processed+ch,unprocessed);
        sum+=subseq(processed + (int)(ch),unprocessed);
        sum+=subseq(processed,unprocessed);
        return sum;
    }


    public static int subseqUnique(String processed, String unprocessed, Set<String> set){
        if (unprocessed.isEmpty()){
            if (processed.isEmpty() && !set.contains(processed)){
                set.add(processed);
                return 0;
            }else {
                set.add(processed);
            }
        }
        char ch= unprocessed.charAt(0);

        unprocessed=unprocessed.substring(1);

        int sum=0;

        sum+=subseqUnique(processed+ch,unprocessed,set);
        sum+=subseqUnique(processed,unprocessed,set);
        return sum;
    }
}
