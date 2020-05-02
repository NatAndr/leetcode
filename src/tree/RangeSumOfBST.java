package tree;

//Given the root node of a binary search tree, return the sum of values of all nodes with value between L and R (inclusive).
//
//The binary search tree is guaranteed to have unique values.
//
//
//
//Example 1:
//
//Input: root = [10,5,15,3,7,null,18], L = 7, R = 15
//Output: 32
//Example 2:
//
//Input: root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
//Output: 23

public class RangeSumOfBST {
    int sum;

    public int rangeSumBST(TreeNode root, int L, int R) {
        search(root, L, R);

        return sum;
    }

    private void search(TreeNode root, int L, int R) {
        if (root == null) {
            return;
        }

        if (root.val >= 7 && root.val <= R) {
            sum += root.val;
        }

        if (L < root.val) {
            search(root.left, L, R);
        }
        if (R > root.val) {
            search(root.right, L, R);
        }
    }
}
