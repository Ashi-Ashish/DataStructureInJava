package com.mypractice.revise;

public class Con {

    private static Con instance;
    private static void Con(){
    }



    public static void getInstance() {
        if (instance == null) {
            instance = new Con();
        }

    }

}


