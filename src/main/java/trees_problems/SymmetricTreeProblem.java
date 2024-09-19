package trees_problems;

import helpers.TreeNode;

import java.util.*;

public class SymmetricTreeProblem {
    //  https://leetcode.com/problems/symmetric-tree/description/

    public static boolean isSymmetric(TreeNode root) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        fillMap(root, 0, map);

        for (int level = map.size() - 1; level >= 0; level--) {
            List<Integer>  levelData = map.get(level);
            System.out.println(levelData);

            int size = levelData.size();
            for (int i = 0; i < size / 2; i++) {
                if (!Objects.equals(levelData.get(i), levelData.get(size - 1 - i)))
                    return false;
            }
        }
        return true;
    }

    private static void fillMap(TreeNode node, int depthLevel, Map<Integer, List<Integer>> map) {
        map.putIfAbsent(depthLevel, new ArrayList<>());
        if (node == null) {
            map.get(depthLevel).add(Integer.MAX_VALUE / 4);
            return;
        }
        map.get(depthLevel).add(node.val);

        fillMap(node.left, depthLevel + 1, map);
        fillMap(node.right, depthLevel + 1, map);
    }
}
