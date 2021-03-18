package com.mypractice.lecture_24;

public class BinarySearchTree {
    private Node root;

    public void add(int value) {
        this.root = add(this.root, value);
    }

    private Node add(Node node, int value) {
        if (node==null){
            Node n=new Node(value);
            return n;
        }

        if (node.value>value){
            node.left=add(node.left,value);
        }else if (node.value<value){
            node.right=add(node.right,value);
        }

        return node;
    }


    public boolean find(int target){
        return find(this.root,target);
    }

    private boolean find(Node node, int target) {
        if (node==null){
            return false;
        }
        if (node.value==target){
            return true;
        }else if (node.value>target){
            return find(node.left,target);
        }else {
            return find(node.right,target);
        }
    }

    public void inOrder(){
        inOrder(this.root);
    }

    private void inOrder(Node node) {
        if (node==null){
            return ;
        }
        inOrder(node.left);
        System.out.println(node.value);
        inOrder(node.right);
    }


    public void inOrder(int start, int end){
        inOrder(this.root,start,end);
    }

    private void inOrder(Node node, int start, int end) {
        if (node==null){
            return ;
        }

        if (node.value > start) {
            inOrder(node.left, start, end);
        }
        if (node.value >= start && node.value<=end) {
            System.out.println(node.value);
        }
        if (node.value<end) {
            inOrder(node.right);
        }
    }


    public void generateFromSorted(int[] nums){
        this.root=generateFromSorted(nums,0,nums.length);
    }

    private Node generateFromSorted(int[] nums, int start, int end) {

        if(start>=end){
            return null;
        }
        int mid=(start+end)/2;
        Node node=new Node(nums[mid]);

        node.left=generateFromSorted(nums, start, mid);
        node.right=generateFromSorted(nums, mid+1, end);
        return node;
    }


    public void display() {
        display("", this.root, "root");
    }

    private void display(String indent, Node node, String type) {
        if (node == null) {
            return;
        }

        System.out.println(indent + node.value + " " + type);

        display(indent + "\t", node.right, "right");
        display(indent + "\t", node.left, "left");
    }



    private class Node {
        private int value;
        private Node right;
        private Node left;

        public Node(int value) {
            this.value = value;
        }

    }



}
