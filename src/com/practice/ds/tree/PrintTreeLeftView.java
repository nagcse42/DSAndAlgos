package com.practice.ds.tree;

public class PrintTreeLeftView {

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Tree Values : ");
        printTree(root);
    }

    private static void printTree(Node tree) {
        if(tree != null && tree.value != null) {
            System.out.println(tree.value);
            printTree(tree.left);
            printTree(tree.right);
        }
    }
}
