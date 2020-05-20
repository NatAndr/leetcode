package tree;

import java.util.ArrayList;
import java.util.List;

public class KthSmallestElementInBST {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();

        traverse(root, list);

        return k <= list.size() ? list.get(k - 1) : -1;
    }

    private void traverse(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }

        traverse(root.left, list);
        list.add(root.val);
        traverse(root.right, list);
    }

    public static void main(String[] args) {
        TreeNode treeNode = TreeUtil.initializeTree(new Integer[]{5, 3, 6, 2, 4, null, null, 1});
        int i = new KthSmallestElementInBST().kthSmallest(treeNode, 4);
        System.out.println(i);
    }
}
