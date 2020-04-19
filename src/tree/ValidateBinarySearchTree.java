package tree;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return isBST(root, null, null);
    }

    private boolean isBST(TreeNode node, Integer min, Integer max) {
        if (node == null) {
            return true;
        }

        if (min != null && node.val <= min || max != null && node.val >= max) {
            return false;
        }

        return isBST(node.left, min, node.val) && isBST(node.right, node.val, max);
    }
}
