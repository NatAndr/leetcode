package tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new LinkedList<>();

        stack.push(root);

        Stack<TreeNode> out = new Stack<>();


        while (!stack.isEmpty()) {
            TreeNode cur = stack.pop();

        }

        return list;
    }
}
