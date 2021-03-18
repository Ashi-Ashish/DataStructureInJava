package com.mypractice.Nagarro;

import java.util.HashMap;

public class Anagram {

    public static void main(String[] args) {

        HashMap<Character, Integer> map = new HashMap<>();
        String str1 = "geeksforgeeks";
        String str2 = "forgeesgeeks";

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (map.containsKey(ch)){
                int nv = map.get(ch) + 1;
                map.put(ch, nv);
            } else {
                map.put(ch,1);
            }
        }

        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            if (map.containsKey(ch)){
                int nv = map.get(ch) - 1;
                map.put(ch, nv);
                if (nv == 0){
                    map.remove(ch);
                }
            } else {
                System.out.println("Not Anagram");
                return;
            }
        }
        if (map.size()==0) {
            System.out.println("Anagram");
        }else {
            System.out.println("Not Anagram");
        }
    }
}
