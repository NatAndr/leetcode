package tree;

public class PathSum_III {
//You are given a binary tree in which each node contains an integer value.
//
//Find the number of paths that sum to a given value.
//
//The path does not need to start or end at the root or a leaf, but it must go downwards (traveling only from parent nodes to child nodes).
//
//The tree has no more than 1,000 nodes and the values are in the range -1,000,000 to 1,000,000.

    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }

        return count(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    private int count(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }

        return (root.val == sum ? 1 : 0) + count(root.left, sum - root.val) + count(root.right, sum - root.val);
    }
}
