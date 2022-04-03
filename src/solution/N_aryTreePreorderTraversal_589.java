package solution;

import java.util.ArrayList;
import java.util.List;

//Given the root of an n-ary tree, return the preorder traversal of its nodes' values.
//
//Nary-Tree input serialization is represented in their level order traversal. Each group of children is separated by the null value

public class N_aryTreePreorderTraversal_589 {
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();

        return preorder(list, root);
    }

    private List<Integer> preorder(List<Integer> list, Node root) {
        if (root == null) return list;

        list.add(root.val);

        for (Node node : root.children) {
            list = preorder(list, node);
        }

        return list;
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
