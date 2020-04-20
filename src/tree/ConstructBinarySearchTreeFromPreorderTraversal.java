package tree;

public class ConstructBinarySearchTreeFromPreorderTraversal {
//    Return the root node of a binary search tree that matches the given preorder traversal.
//
//(Recall that a binary search tree is a binary tree where for every node,
// any descendant of node.left has a value < node.val, and any descendant of node.right has a value > node.val.
// Also recall that a preorder traversal displays the value of the node first, then traverses node.left,
// then traverses node.right.)

    public TreeNode bstFromPreorder(int[] preorder) {
        return doTree(preorder, 0, preorder.length - 1);
    }

    private TreeNode doTree(int[] preorder, int l, int r) {
        if (l > r) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[l]);

        if (l == r) {
            return root;
        }

        int i = l + 1; //index where right nodes start
        while (i <= r && preorder[i] < preorder[l]) {
            i++;
        }

        root.left = doTree(preorder, l + 1, i - 1);
        root.right = doTree(preorder, i, r);

        return root;
    }
}
