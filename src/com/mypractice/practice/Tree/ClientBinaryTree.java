package com.mypractice.practice.Tree;

import java.util.Scanner;

public class ClientBinaryTree {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        BinaryTree tree=new BinaryTree();

        for (int i = 0; i < 5; i++) {
            tree.populate(s);
        }

        tree.display();
    }
}
