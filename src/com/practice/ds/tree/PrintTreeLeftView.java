package com.practice.ds.tree;

/**
 * This class print the left view of tree.
 *       1
 *    2     3
 * 4      5    6
 *     7          8
 *                   9
 *                      10
 *
 * It should print 1,2,4,7,9,10
 */
public class PrintTreeLeftView {
    static Integer treeLevel = 0;

    private static void printLeftSideView(Node treeNode, Integer currentNodeLevel) {
            if(treeNode == null) {
                return;
            }

            if(treeLevel < currentNodeLevel) {
                System.out.println(treeNode.value);
                treeLevel = currentNodeLevel;
            }

            printLeftSideView(treeNode.left, currentNodeLevel+1);
            printLeftSideView(treeNode.right, currentNodeLevel+1);
    }

    /**
     *           1
     *         2       3
     *      4    5  6     7
     *   9                   8
     *                          10
     *
     * @param args
     */
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.left = new Node(8);
        root.left.left.left = new Node(9);
        root.right.right.left.right = new Node(10);

        System.out.println("Tree Values : ");
       // printTree(root);
        printLeftSideView(root, 1);
    }

    private static void printTree(Node tree) {
        if(tree != null && tree.value != null) {
            System.out.println(tree.value);
            printTree(tree.left);
            printTree(tree.right);
        }
    }
}
