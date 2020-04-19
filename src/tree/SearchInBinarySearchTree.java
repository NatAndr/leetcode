package tree;

public class SearchInBinarySearchTree {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return root;
        }

        return search(root, val);
    }

    private TreeNode search(TreeNode node, int val) {
        if (node == null) {
            return node;
        }

        if (node.val == val) {
            return node;
        }

        if (node.val > val) {
            return search(node.left, val);
        }

        return search(node.right, val);
    }
}
