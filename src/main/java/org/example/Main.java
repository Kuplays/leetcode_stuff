package org.example;

import array_problems.GoodPairProblem;
import array_problems.WordsContainCharacterProblem;
import divide_conquer.SortedArrayToBSTProblem;
import helpers.TreeNode;

public class Main {
    public static void main(String[] args) {
        TreeNode root = null;
        int[] nums = {-10, -3, 0, 5, 9};
        root = SortedArrayToBSTProblem.contstructBST(nums);
        postorder(root);
    }

    public static void postorder(TreeNode node) {
        if (node == null) return;
        System.out.print(node.val + " ");
        postorder(node.left);
        postorder(node.right);
    }
}