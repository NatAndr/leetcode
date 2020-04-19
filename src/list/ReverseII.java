package list;

public class ReverseII {
//    Input: 1->2->3->4->5->NULL
//Output: 5->4->3->2->1->NULL

    public ListNode reverseList(ListNode head) {
        return swap(head, null);
    }

    private ListNode swap(ListNode curr, ListNode prev) {
        if (curr == null) {
            return prev;
        }

        ListNode temp = curr.next;
        curr.next = prev;

        return swap(temp, curr);
    }


    public static void main(String[] args) {
        ListNode listNode = ListUtil.intArrayToListNode(new int[]{1, 2, 3, 4, 5});
        ListUtil.printList(listNode);
        ListNode listNode1 = new ReverseII().reverseList(listNode);
        ListUtil.printList(listNode1);
    }
}
