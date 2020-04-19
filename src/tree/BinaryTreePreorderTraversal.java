package tree;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        return visit(root, list);
    }

    private List<Integer> visit(TreeNode node, List<Integer> list) {
        if (node == null) {
            return list;
        }
        list.add(node.val);
        visit(node.left, list);
        visit(node.right, list);

        return list;
    }
}
