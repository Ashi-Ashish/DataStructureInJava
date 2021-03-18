package com.mypractice.lecture_12;

public class Perm {
    public static void main(String[] args) {


        permutation("","abc");

    }

    public static void permutation( String processed,String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        for (int i = 0; i < unprocessed.length(); i++) {
            permutation(processed+unprocessed.charAt(i),unprocessed.substring(0,i)+unprocessed.substring(i+1));

        }
    }
}
