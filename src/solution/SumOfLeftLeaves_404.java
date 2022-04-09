package solution;

//Given the root of a binary tree, return the sum of all left leaves.
//
//A leaf is a node with no children. A left leaf is a leaf that is the left child of another node.

public class SumOfLeftLeaves_404 {
    public int sumOfLeftLeaves(TreeNode root) {

        return sum(root, 0, false);
    }

    private int sum(TreeNode root, int sum, boolean isLeft) {
        if (root == null) return sum;
        if (root.left == null && root.right == null) {
            sum += isLeft ? root.val : 0;
            return sum;
        }


        return sum(root.left, sum, true) + sum(root.right, sum, false);
    }
}

class TreeNode {
    int val;
    solution.TreeNode left;
    solution.TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, solution.TreeNode left, solution.TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}



