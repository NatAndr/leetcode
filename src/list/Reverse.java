package list;

public class Reverse {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }

    public static void main(String[] args) {
        ListNode listNode = ListUtil.intArrayToListNode(new int[]{1, 2, 3, 4, 5});
        ListUtil.printList(listNode);
        ListNode listNode1 = new Reverse().reverseList(listNode);
        ListUtil.printList(listNode1);
    }
}
