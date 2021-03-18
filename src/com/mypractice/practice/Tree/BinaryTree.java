package com.mypractice.practice.Tree;

import java.util.Scanner;

public class BinaryTree {

    private Node root;

    public void populate(Scanner s) {
        this.root = populate(s, root);
    }

    public Node populate(Scanner s, Node node) {

        if (node == null) {
            System.out.println("enter the value");
            int value = s.nextInt();
            return new Node(value);
        }

        System.out.println("current node is " + node.value);

        System.out.println(" want to add left ?");

        boolean isLeft = s.nextBoolean();

        if (isLeft) {
            node.left = populate(s, node.left);
        } else {
            node.right = populate(s, node.right);
        }
        return node;
    }


    public void display(){
        display(root,"");
    }

    private void display(Node node,String indent){
        if (node==null){
            return;
        }
        System.out.println(indent+node.value);
        display(node.left,indent+"\t");
        display(node.right,indent+"\t");
    }


    private class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }
    }
}
