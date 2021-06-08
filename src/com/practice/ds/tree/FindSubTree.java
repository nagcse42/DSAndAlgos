package com.practice.ds.tree;

/**
 * It finds if sub tree exists ot not
 * --- Main Tree
 *          1
 *       2     3
 *    4    5
 *
 * -- Sub Tree
 *     2
 *   4   5
 *
 * Output: true as 2 4 5 sub tree exist in main tree
 */
public class FindSubTree {

    public static void main(String[] args) {
        Node mainTree = new Node(1);
        // Left
        mainTree.left = new Node(2);
        mainTree.left.left = new Node(4);
        mainTree.left.right = new Node(5);
        // right
        mainTree.right = new Node(3);
        mainTree.right.left = new Node(6);
        mainTree.right.right = new Node(7);

        Node subTree1 = new Node(2);
        subTree1.left = new Node(4);
        subTree1.right = new Node(5);

        Node subTree2 = new Node(3);
        subTree2.left = new Node(6);
        subTree2.right = new Node(7);

        Node subTree3 = new Node(3);
        subTree3.left = new Node(8);
        subTree3.right = new Node(9);

        System.out.println("Is subTree1 SubTree? : "+ findSubTree(mainTree, subTree1));
        System.out.println("Is subTree2 SubTree? : "+ findSubTree(mainTree, subTree2));
        System.out.println("Is subTree3 SubTree? : "+ findSubTree(mainTree, subTree3));
    }

    private static boolean findSubTree(Node tree, Node subTree) {
        if(tree == null) {
            return false;
        } else if(isSubTreeFound(tree, subTree)) {
            return true;
        } else {
            return isSubTreeFound(tree.left, subTree) || isSubTreeFound(tree.right, subTree);
        }
    }

    private static boolean isSubTreeFound(Node tree, Node subTree) {
        if(tree == null || subTree == null) {
            return  tree == null && subTree == null;
        } else if(tree.value == subTree.value) {
            return isSubTreeFound(tree.left, subTree.left) && isSubTreeFound(tree.right, subTree.right);
        } else {
            return false;
        }
    }
}
