package com.mypractice.lecture_7;

public class Toggle {
    public static void main(String[] args) {
        String line="AZazAZ";
        System.out.println(ascii(line));
    }

    public static String ascii(String line){
        StringBuilder builder=new StringBuilder();
        int i;
        for (i = 0; i < line.length()-1; i++) {

            char present=line.charAt(i);
            char next=line.charAt(i+1);

            builder.append(present);
            builder.append(Math.abs(present-next));
        }
        builder.append(line.charAt(i));
        return builder.toString();
    }

    /*public static String odd_even(String line){

        StringBuilder builder=new StringBuilder();

        for (int i = 0; i < line.length(); i++) {
            char ch=line.charAt(i);

            if ((ch>='A' && ch<='z')) {

                if (i % 2 == 0) {
                    ch = (char) (ch - 1);
                } else {
                    ch = (char) (ch + 1);
                }
                builder.append(ch);
            }
        }
        return builder.toString() ;
    }*/
}
