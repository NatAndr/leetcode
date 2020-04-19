package tree;

public class LongestUnivaluePath {

//    Given a binary tree, find the length of the longest path where each node in the path has the same value. This path may or may not pass through the root.
//
//The length of path between two nodes is represented by the number of edges between them.

    int count;

    public int longestUnivaluePath(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return count(root);
    }

    private int count(TreeNode root) {
        if (root == null) {
            return 0;
        }


        int left = count(root.left);
        int right = count(root.right);
        int leftCurrent = 0;
        int rightCurrent = 0;

        if (root.left != null && root.left.val == root.val) {
            leftCurrent = left + 1;
        }

        if (root.right != null && root.right.val == root.val) {
            rightCurrent = right + 1;
        }

        count = Math.max(count, leftCurrent + rightCurrent);

        return Math.max(leftCurrent, rightCurrent);
    }
}
