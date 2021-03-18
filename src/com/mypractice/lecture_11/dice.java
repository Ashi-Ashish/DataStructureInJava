package com.mypractice.lecture_11;

public class dice {
    public static void main(String[] args) {
        String processed = "";
        int target = 5;
        System.out.println(diceCount(processed, target));
    }

    public static int diceCount(String processed, int target) {

        if (target == 0) {
//            System.out.println(processed);
            return 1;
        }
        int sum = 0;
        for (int i = 1; i <= 3 && i <= target; i++) {
            sum += diceCount(processed + i, target - i);
        }
        return sum;
    }

    public static int permutationCount(String processed, String unprocessed) {

        if (unprocessed.isEmpty()) {
            return 1;
        }

        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);

        int sum=0;
        for (int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0, i);
            String second = processed.substring(i);

            sum+=permutationCount(first + ch + second, unprocessed);
        }
        return sum;
    }
}
