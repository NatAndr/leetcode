package list;

public class AddTwoNumbers {
//    Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//    Output: 7 -> 0 -> 8
//    Explanation: 342 + 465 = 807


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;

        int add = 0;
        while (p1 != null || p2 != null) {
            int n1 = p1 == null ? 0 : p1.val;
            int n2 = p2 == null ? 0 : p2.val;
            int sum = n1 + n2 + add;
            add = sum / 10;
            p.next = new ListNode(sum % 10);
            p = p.next;
            if (p1 != null) p1 = p1.next;
            if (p2 != null) p2 = p2.next;
        }

        if (add != 0) {
            p.next = new ListNode(add);
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode listNode1 = ListUtil.intArrayToListNode(new int[]{2, 4, 3});
        ListNode listNode2 = ListUtil.intArrayToListNode(new int[]{5, 6, 4});
        ListUtil.printList(listNode1);
        ListUtil.printList(listNode2);
        ListNode listNode3 = new AddTwoNumbers().addTwoNumbers(listNode1, listNode2);
        ListUtil.printList(listNode3);
    }
}
