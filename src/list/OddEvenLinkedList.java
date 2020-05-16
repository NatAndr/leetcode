package list;

//Given a singly linked list, group all odd nodes together followed by the even nodes.
// Please note here we are talking about the node number and not the value in the nodes.
//
//You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.
//
//Example 1:
//
//Input: 1->2->3->4->5->NULL
//Output: 1->3->5->2->4->NULL
//Example 2:
//
//Input: 2->1->3->5->6->4->7->NULL
//Output: 2->3->6->7->1->5->4->NULL
//Note:
//
//The relative order inside both the even and odd groups should remain as it was in the input.
//The first node is considered odd, the second node even and so on ...

import java.util.ArrayList;
import java.util.List;

public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return head;
        }

        List<Integer> list = new ArrayList<>();
        ListNode p1 = head;
        ListNode p2 = head;

        int num = 1;
        int i = 0;
        while (p2 != null || p1 != null) {
            if (p2 != null) {
                if (num++ % 2 != 0) {
                    p1.val = p2.val;
                    p1 = p1.next;
                } else {
                    list.add(p2.val);
                }
                p2 = p2.next;
            } else {
                p1.val = list.get(i++);
                p1 = p1.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode listNode1 = ListUtil.intArrayToListNode(new int[]{2,1,3,5,6,4,7});
        ListNode listNode = new OddEvenLinkedList().oddEvenList(listNode1);
        ListUtil.printList(listNode);
    }

}
