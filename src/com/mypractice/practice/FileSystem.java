package com.mypractice.practice;

import java.io.File;

public class FileSystem {
    public static void main(String[] args) {
        File file = new File("src");

        System.out.println(file.getAbsolutePath());

        display(file, "");
    }

    private static void display(File file, String indent) {

        System.out.println(indent + file.getName());

        if (file.isDirectory()) {
            File[] children = file.listFiles();

            for (int i = 0; i < children.length && children != null; i++) {
                File child = children[i];
                display(child, indent + "\t");
            }
        }
    }
}
