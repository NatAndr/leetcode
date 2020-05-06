package tree;

public class PathSum {
//    Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
//
//Note: A leaf is a node with no children.

    public boolean hasPathSum(TreeNode root, int sum) {
        return traverse(root, sum);
    }

    private boolean traverse(TreeNode node, int restSum) {
        if (node == null) return false;


        if (node.left == null && node.right == null && node.val == restSum) {
            return true;
        }

        return traverse(node.left, restSum - node.val) || traverse(node.right, restSum - node.val);
    }

    public static void main(String[] args) {

    }
}
