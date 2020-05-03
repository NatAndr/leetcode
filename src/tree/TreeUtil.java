package tree;

import java.util.ArrayDeque;
import java.util.Queue;

//thanks to redsun9 (https://github.com/redsun9/leetcode/)

public class TreeUtil {
    public static TreeNode initializeTree(Integer[] values) {
        if (values.length == 0) return null;
        TreeNode rootNode = new TreeNode(values[0]);
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(rootNode);
        int i = 1;
        int n = values.length;
        while (i < n) {
            TreeNode node = queue.poll();
            if (values[i] != null) {
                TreeNode leftNode = new TreeNode(values[i]);
                node.left = leftNode;
                queue.add(leftNode);
            }
            i++;
            if (i < n && values[i] != null) {
                TreeNode rightNode = new TreeNode(values[i]);
                node.right = rightNode;
                queue.add(rightNode);
            }
            i++;
        }
        return rootNode;
    }
}
