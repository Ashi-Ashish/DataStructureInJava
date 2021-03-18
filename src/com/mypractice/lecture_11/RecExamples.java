package com.mypractice.lecture_11;

public class RecExamples {
    public static void main(String[] args) {

        RemoveHiNotT("","hithi");
    }

    public static void duplicates(String processed, String unprocessed){
        if (unprocessed.length()<2){
            System.out.println(processed+unprocessed);
            return;
        }

        if (unprocessed.charAt(0)==unprocessed.charAt(1)){
            duplicates(processed,unprocessed.substring(1));
        }else{
            duplicates(processed+unprocessed.charAt(0),unprocessed.substring(1));
        }
    }

    public static void RemoveHi(String processed, String unprocessed){
        if (unprocessed.length()<2){
            System.out.println(processed+unprocessed);
            return;
        }

        if (unprocessed.charAt(0)=='h'&& unprocessed.charAt(1)=='i'){
            RemoveHi(processed,unprocessed.substring(2));
        }else{
            RemoveHi(processed+unprocessed.charAt(0),unprocessed.substring(1));
        }
    }

    public static void RemoveHiNotT(String processed, String unprocessed){
        if (unprocessed.length()<2){
            System.out.println(processed+unprocessed);
            return;
        }

        if (unprocessed.charAt(0)=='h'&&unprocessed.charAt(1)=='i'&&unprocessed.charAt(2)!='t'||unprocessed.charAt(0)=='h'&& unprocessed.charAt(1)=='i'&& unprocessed.length()<=3){

                RemoveHiNotT(processed,unprocessed.substring(2));

        }else{
            RemoveHiNotT(processed+unprocessed.charAt(0),unprocessed.substring(1));
        }
    }
}
