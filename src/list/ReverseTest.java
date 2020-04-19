package list;

public class ReverseTest {
    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode prev = null;

        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }

        return prev;
    }

    public static void main(String[] args) {
        ListNode listNode = ListUtil.intArrayToListNode(new int[]{1, 2, 3, 4, 5});
        ListUtil.printList(listNode);
        ListNode listNode1 = new ReverseTest().reverseList(listNode);
        ListUtil.printList(listNode1);
    }
}
