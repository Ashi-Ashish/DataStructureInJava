package com.mypractice.lecture_7;

public class Example {
    public static void main(String[] args) {
        String line="hello";

//        toggle(line);
        System.out.println(toggle(line));

        /*char ch='c';

        StringBuilder builder =new StringBuilder(line);

        System.out.println((char)(ch-'a'+'A'));*/
        /*for (int i = 1; i < builder.length(); i+=2) {
            builder.setCharAt(2, '_');
        }*/

        /*for (int i = 0; i < builder.length(); i++) {
            builder.insert(i+1,"_");
        }*/

        /*for (int i = 0; i < 1000000; i++) {
            builder.append("a");
        }*/

//        System.out.println(builder);
    }

    public static String toggle(String line){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            char ch =line.charAt(i);

            if((ch >= 'a') &&(ch <= 'a') &&(ch >= 'A') && (ch <='Z')){
                ch= (char) (ch-'a'+'A');
            }else if ((ch>='A'&& ch<='Z')){
                ch= (char)(ch-'A'+'a');

            }
            builder.append(ch);
        }
        return builder.toString();
    }
}
