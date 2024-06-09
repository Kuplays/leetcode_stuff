package divide_conquer;

import helpers.TreeNode;

import java.util.Arrays;

public class SortedArrayToBSTProblem {
    //https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/
    TreeNode root;

    public static TreeNode contstructBST(int[] nums) {
        int leftBound = 0, rightBound = nums.length - 1;
        return SortedArrayToBSTProblem.recursiveConstruct(nums, leftBound, rightBound);
    }
    private static TreeNode recursiveConstruct(int[] array, int leftBound, int rightBound) {
        if (leftBound > rightBound) return null;
        int middle = (leftBound + rightBound) / 2;
        //System.out.println("LEFT BOUND " + leftBound + ", RIGHT BOUND " + rightBound + " MIDDLE: " + middle);
        TreeNode node = new TreeNode(array[middle]);
        node.left = recursiveConstruct(array, leftBound, middle - 1);
        node.right = recursiveConstruct(array, middle + 1, rightBound);
        return node;
    }
}
