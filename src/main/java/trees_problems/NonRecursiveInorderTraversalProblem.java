package trees_problems;

import helpers.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NonRecursiveInorderTraversalProblem {
    //https://leetcode.com/problems/binary-tree-inorder-traversal/description/
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> traversal = new ArrayList<>();
        Stack<TreeNode> traversalStack = new Stack<>();

        while (root != null || !traversalStack.isEmpty()) {

            while (root != null) {
                traversalStack.push(root);
                root = root.left;
            }
            root = traversalStack.pop();
            traversal.add(root.val);
            root = root.right;
        }
        return traversal;
    }
}
