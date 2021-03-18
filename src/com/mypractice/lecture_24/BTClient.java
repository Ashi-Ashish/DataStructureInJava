package com.mypractice.lecture_24;

public class BTClient {
    public static void main(String[] args) {
        BinarySearchTreeBalancing tree=new BinarySearchTreeBalancing();
        /*tree.add(10);
        tree.add(7);
        tree.add(15);
        tree.add(12);

        tree.display();

        System.out.println(tree.find(15));*/

        int []arr=new int[1000];
        for (int i = 0; i < 1000; i++) {
            arr[i]=i+1;
        }

        tree.generateFromSorted(arr);

        tree.display();

        System.out.println(tree.isBalanced());
    }
}
