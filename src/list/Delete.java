package list;

public class Delete {
    public ListNode deleteAtMiddle(ListNode head, int position) {
        if (position == 1) {
            return head == null ? head : head.next;
        }
        ListNode curr = head;
        ListNode prevNode = curr;
        int count = 0;
        while(curr != null) {
            count++;
            if(count == position) {
                prevNode.next = curr.next;
                curr.next = null;
            }
            else {
                prevNode = curr;
                curr = curr.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode listNode1 = ListUtil.intArrayToListNode(new int[]{1,2,3,4});

        ListNode listNode = new Delete().deleteAtMiddle(listNode1, 1);
        ListUtil.printList(listNode);

    }
}
