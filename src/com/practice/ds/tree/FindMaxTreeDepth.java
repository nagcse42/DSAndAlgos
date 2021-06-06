package com.practice.ds.tree;

/**
 * This will find max depth or height of tree
 *              1
 *           2     3
 *         4           5
 *                        6
 *
 *   It will give depth as 4
 */
public class FindMaxTreeDepth {

    public static void main(String[] args) {
        Node tree = new Node(1);
        // Left side of Root Node
        tree.left = new Node(2);
        tree.left.left = new Node(4);

        // Right side of Root Node
        tree.right = new Node(3);
        tree.right.right = new Node(5);
        tree.right.right.left = new Node(6);

        Integer depthOfTree = findMaxDepth(tree);
        System.out.println("Tree Depth :" +depthOfTree);

    }

    private static Integer findMaxDepth(Node treeNode) {
        if(treeNode == null) {
            return 0;
        } else {
            Integer leftDepth = findMaxDepth(treeNode.left);
            Integer rightDepth = findMaxDepth(treeNode.right);
            return leftDepth > rightDepth ? leftDepth+1 : rightDepth+1;
        }
    }
}
