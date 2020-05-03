package tree;

//A binary tree is univalued if every node in the tree has the same value.
//
//Return true if and only if the given tree is univalued.

public class UnivaluedBinaryTree {
    public boolean isUnivalTree(TreeNode root) {
        return visit(root, root.val);
    }

    private boolean visit(TreeNode root, int val) {
        if (root == null) return true;

        if (root.val != val) return false;

        return visit(root.left, root.val) && visit(root.right, root.val);
    }
}
