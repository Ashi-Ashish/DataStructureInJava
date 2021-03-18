package com.mypractice.lecture_28;

public class EditDist {
    public static void main(String[] args) {
        String str1 = "aman";
        String str2 = "manan";

        System.out.println(editDistance(str1, str2, str1.length(), str2.length()));
        System.out.println(editDistanceDPItr(str1,str2));
    }


    public static int editDistance(String f, String s, int flen, int slen) {

        if (flen == 0) {
            return slen;
        }
        if (slen == 0) {
            return flen;
        }
        int sol = 0;
        if (f.charAt(flen - 1) == s.charAt(slen - 1)) {
            sol = editDistance(f, s, flen - 1, slen - 1);
        } else {
            int rm_f = editDistance(f, s, flen - 1, slen);
            int rm_s = editDistance(f, s, flen, slen - 1);
            int rep = editDistance(f, s, flen - 1, slen - 1);

            sol = 1 + Math.min(rm_f, Math.min(rm_s, rep));
        }
        return sol;
    }


    public static int editDistanceDP(String f, String s, int flen, int slen, Integer[][] memory) {

        if (flen == 0) {
            return slen;
        }
        if (slen == 0) {
            return flen;
        }

        if (memory[flen][slen] != null) {
            return memory[flen][slen];
        }

        int sol = 0;
        if (f.charAt(flen - 1) == s.charAt(slen - 1)) {
            sol = editDistance(f, s, flen - 1, slen - 1);
        } else {
            int rm_f = editDistanceDP(f, s, flen - 1, slen, memory);
            int rm_s = editDistanceDP(f, s, flen, slen - 1, memory);
            int rep = editDistanceDP(f, s, flen - 1, slen - 1, memory);

            sol = 1 + Math.min(rm_f, Math.min(rm_s, rep));
        }
        memory[flen][slen] = sol;
        return sol;
    }


    public static int editDistanceDPItr(String f,String s){
        int flen=f.length();
        int slen=s.length();

        int [][] memory=new int[flen+1][slen+1];

        for (int i = 0; i <= flen; i++) {
            for (int j = 0; j <= slen; j++) {

                if (i==0){
                    memory[i][j]=j;
                }else if (j==0){
                    memory[i][j]=i;
                }else {

                    if (s.charAt(j) == f.charAt(j)) {
                        memory[i][j] = memory[i - 1][j - 1];
                    } else {
                        memory[i][j] = 1 + Math.min(memory[i - 1][j - 1],Math.min(memory[i][j-1],memory[i-1][j]));
                    }
                }

            }
        }
        return memory[flen][slen];
    }


}
