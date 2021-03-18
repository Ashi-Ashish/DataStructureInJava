package com.mypractice.Nagarro;

public class Pangram {
    public static void main(String[] args) {

        String str = "The quick brown fox jumps over the lazy dog";
        int[] arr = new int [26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z'){
                arr[ch - 'A' + 'a']++;
            } else if (ch >= 'a' && ch <= 'a'){
                arr[ch - 'a']++;
            }
        }
    }
}
