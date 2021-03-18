package com.mypractice.Nagarro;

import java.util.HashMap;

public class InterleavedWord {
    public static void main(String args[]) {

        HashMap<Character, Integer> map1 = new HashMap<>();
        String arr[] = {"cat", "bat", "father", "mother",};
        String str = "fcaatther";
        boolean flag = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (map1.containsKey(ch)) {
                int nv = map1.get(ch) + 1;
                map1.put(str.charAt(i), nv);
            } else {
                map1.put(str.charAt(i), 1);
            }
        }



        System.out.println(str.contains("caat"));
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length(); j++) {
                char ch = arr[i].charAt(j);
                if (map1.containsKey(ch) && map1.get(ch) > 0){
                    int nv = map1.get(ch) - 1;
                    map1.put(ch, nv);
                }else {
                    flag = true;
                    break;
                }
            }

            if (flag == false){
                System.out.println(arr[i]);
            }
            flag = false;
        }
    }
}
