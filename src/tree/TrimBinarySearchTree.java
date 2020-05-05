package tree;

//Given a binary search tree and the lowest and highest boundaries as L and R,
// trim the tree so that all its elements lies in [L, R] (R >= L).
// You might need to change the root of the tree, so the result should return the new root of the trimmed binary search tree.

public class TrimBinarySearchTree {

    public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root == null) return root;

        root.left = trimBST(root.left, L, R);
        root.right = trimBST(root.right, L, R);

        if (root.val < L) return root.right;
        if (root.val > R) return root.left;

        return root;
    }
}
