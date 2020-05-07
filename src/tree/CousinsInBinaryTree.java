package tree;

//In a binary tree, the root node is at depth 0, and children of each depth k node are at depth k+1.
//
//Two nodes of a binary tree are cousins if they have the same depth, but have different parents.
//
//We are given the root of a binary tree with unique values, and the values x and y of two different nodes in the tree.
//
//Return true if and only if the nodes corresponding to the values x and y are cousins.
//
//Example 1:
//
//
//Input: root = [1,2,3,4], x = 4, y = 3
//Output: false
//Example 2:
//
//Input: root = [1,2,3,null,4,null,5], x = 5, y = 4
//Output: true
//Example 3:
//
//Input: root = [1,2,3,null,4], x = 2, y = 3
//Output: false
//
//
//Note:
//
//The number of nodes in the tree will be between 2 and 100.
//Each node has a unique integer value from 1 to 100.

public class CousinsInBinaryTree {
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNodeInfo info1 = getInfo(root, x, 0);
        TreeNodeInfo info2 = getInfo(root, y, 0);

        return info1.isCousins(info2);
    }

    private TreeNodeInfo getInfo(TreeNode node, int val, int level) {
        if (node == null) return null;

        if (node.val == val) {
            return new TreeNodeInfo(null, level);
        }

        if (node.left != null && node.left.val == val || node.right != null && node.right.val == val) {
            return new TreeNodeInfo(node, level + 1);
        }

        TreeNodeInfo info = getInfo(node.left, val, level + 1);
        if (info != null) return info;

        return getInfo(node.right, val, level + 1);
    }

    static class TreeNodeInfo {
        TreeNode parent;
        int level;

        TreeNodeInfo(TreeNode treeNodeParent, int treeNodeLevel) {
            parent = treeNodeParent;
            level = treeNodeLevel;
        }

        boolean isCousins(TreeNodeInfo other) {
            return level == other.level && parent.val != other.parent.val;
        }
    }

    public static void main(String[] args) {
        TreeNode treeNode = TreeUtil.initializeTree(new Integer[]{1,null,2,3,null,null,4,null,5});
        boolean cousins = new CousinsInBinaryTree().isCousins(treeNode, 1, 3);
        System.out.println(cousins);
    }
}
