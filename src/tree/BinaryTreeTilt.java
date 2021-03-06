package tree;

//Given a binary tree, return the tilt of the whole tree.
//
//The tilt of a tree node is defined as the absolute difference between the sum of all left subtree node values
// and the sum of all right subtree node values. Null node has tilt 0.
//
//The tilt of the whole tree is defined as the sum of all nodes' tilt.

public class BinaryTreeTilt {
    private int tilt;
    public int findTilt(TreeNode root) {
        search(root);

        return tilt;
    }

    private int search(TreeNode root) {
        if (root == null) return 0;

        int left = search(root.left);
        int right = search(root.right);
        tilt += Math.abs(left - right);

        return left + right + root.val;
    }
}
