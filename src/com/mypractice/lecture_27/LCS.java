package com.mypractice.lecture_27;

public class LCS {
    public static void main(String[] args) {
        System.out.println(lcsDPItr("manan", "anan"));
    }

    public static int lcs(String first, String second, int flen, int slen) {
        if (flen == 0 || slen == 0) {
            return 0;
        }
        int sum = 0;
        if (first.charAt(flen - 1) == second.charAt(slen - 1)) {
            sum = 1 + lcs(first, second, flen - 1, slen - 1);
        } else {
            int r_f = lcs(first, second, flen - 1, slen);
            int r_s = lcs(first, second, flen, slen - 1);

            sum = Math.max(r_f, r_s);
        }
        return sum;
    }


    public static int lcsDP(String first, String second, int flen, int slen, Integer[][] memory) {
        if (flen == 0 || slen == 0) {
            return 0;
        }

        if (memory[flen][slen] != null) {
            return memory[flen][slen];
        }

        int sum = 0;
        if (first.charAt(flen - 1) == second.charAt(slen - 1)) {
            sum = 1 + lcsDP(first, second, flen - 1, slen - 1, memory);
        } else {
            int r_f = lcsDP(first, second, flen - 1, slen, memory);
            int r_s = lcsDP(first, second, flen, slen - 1, memory);

            sum = Math.max(r_f, r_s);
        }
        memory[flen][slen] = sum;
        return sum;
    }


    public static int lcsDPItr(String first, String second) {
        int flen = first.length();
        int slen = second.length();

        int[][] memory = new int[flen + 1][slen + 1];

        for (int r = 0; r <= flen; r++) {
            for (int c = 0; c <= slen; c++) {
                if (r == 0 || c == 0) {
                    memory[r][c] = 0;
                } else {
                    if (first.charAt(r - 1) == second.charAt(c - 1)) {
                        memory[r][c] = 1 + memory[r - 1][c - 1];
                    } else {
                        memory[r][c] = Math.max(memory[r - 1][c], memory[r][c - 1]);
                    }
                }
            }
        }
        return memory[flen][slen];
    }
}