package solution;

//Given the root of a binary tree, check whether it is a mirror of itself
// (i.e., symmetric around its center).

public class SymmetricTree_101 {
    public boolean isSymmetric(TreeNode root) {
        return visit(root.left, root.right);
    }

    private boolean visit(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;

        if (left == null || right == null) return false;

        return left.val == right.val &&
            visit(left.left, right.right) &&
            visit(left.right, right.left);
    }
}
