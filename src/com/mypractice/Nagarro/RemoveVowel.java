package com.mypractice.Nagarro;

public class RemoveVowel {
    public static void main(String[] args) {
        String str = "my name is ashish    MY NAME IS ASHISH";

        str = str.replaceAll("[aeiouAEIOU]","");
        System.out.println(str);
    }
}
