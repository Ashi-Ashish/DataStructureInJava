package com.mypractice.Nagarro;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FirstNonRepeatChar {
    public static void main(String[] args) {
        String str = "abcabc";
        HashMap<Character, Integer> map = new HashMap<>();


        for (int i = 0; i < str.length(); i++) {
            char ch = str .charAt(i);

            if (map.containsKey(ch)){
                map.put(ch , -2

                );
            } else {
                map.put(ch , i);
            }
        }
        char ch = '\0';
        int min = Integer.MAX_VALUE;

        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (Map.Entry<Character, Integer> entry: entries) {
            if (entry.getValue() > -1 && entry.getValue() < min){
                min = entry.getValue();
                ch = entry.getKey();
            }
        }
        System.out.println(ch);
    }
}
