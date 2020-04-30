package tree;

//Given a non-empty binary tree, find the maximum path sum.
//
//For this problem, a path is defined as any sequence of nodes from some starting node to any node in the tree
// along the parent-child connections. The path must contain at least one node and does not need to go through the root.

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
public class BinaryTreeMaximumPathSum {
    private int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        search(root);

        return max;
    }

    private int search(TreeNode root) {
        if (root == null) return 0;

        int left = Math.max(search(root.left), 0);
        int right = Math.max(search(root.right), 0);
        int sum = root.val + left + right;
        max = Math.max(sum, max);

        return root.val + Math.max(left, right);
    }


}
