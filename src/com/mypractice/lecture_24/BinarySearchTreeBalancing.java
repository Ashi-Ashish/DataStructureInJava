package com.mypractice.lecture_24;

public class BinarySearchTreeBalancing {
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

        node.height=Math.max(height(node.left),height(node))+1;
        return node;
    }



    public Node rightRotate(Node x){
        Node y=x.left;
        Node temp=y.right;

        y.right=x;
        x.left=temp;

        x.height=Math.max(height(x.left),height(x.right)+1);
        y.height=Math.max(height(y.left),height(y.right)+1);

        return y;
    }



    public Node leftRotate(Node y){
        Node x=y.right;
        Node temp=x.left;

        y.right=temp;
        x.left=y;

        x.height=Math.max(height(x.left),height(x.right)+1);
        y.height=Math.max(height(y.left),height(y.right)+1);

        return x;
    }




    public boolean isBalanced(){
        return isBalanced(this.root);
    }

    private boolean isBalanced(Node node) {

        if (node==null){
            return true;
        }

        int diff= Math.abs(height(node.left)-height(node.right));


        if (diff>1){
            return false;
        }

        return isBalanced(node.left) && isBalanced(node.right);
    }


    private int height(Node node){
        if (node==null){
            return 0;
        }
        return node.height;
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
        private int height;

        public Node(int value) {
            this.value = value;
            height=1;
        }

    }



}
