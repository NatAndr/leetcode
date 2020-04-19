package tree;

public class DiameterOfBinaryTree {
    //    Given a binary tree, you need to compute the length of the diameter of the tree.
//    The diameter of a binary tree is the length of the longest path between any two nodes in a tree.
//    This path may or may not pass through the root.
    int max;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        count(root);
        return max;
    }

    private int count(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = count(root.left);
        int right = count(root.right);

        max = Math.max(max, left + right);

        return Math.max(left, right) + 1;
    }
}
