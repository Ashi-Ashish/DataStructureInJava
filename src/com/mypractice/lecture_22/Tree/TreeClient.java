package com.mypractice.lecture_22.Tree;

import java.io.File;
import java.util.Scanner;

public class TreeClient {
    public static void main(String[] args) throws Exception{
        BinaryTree tree = new BinaryTree();

        File file = new File("tree_data.txt");

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            tree.populate(s);
        }
        tree.display();
    }
}