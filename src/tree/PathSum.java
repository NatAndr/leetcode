package tree;

public class PathSum {
//    Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
//
//Note: A leaf is a node with no children.

    public boolean hasPathSum(TreeNode root, int sum) {

        return pathSum(root, 0, sum);
    }

    private boolean pathSum(TreeNode root, int initSum, int targetSum) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null) {
            return root.val + initSum == targetSum;
        }


        return pathSum(root.left, root.val + initSum, targetSum) ||
            pathSum(root.right, root.val + initSum, targetSum);
    }

    public static void main(String[] args) {

    }
}
