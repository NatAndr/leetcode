package list;

public class ListUtil {
    static void printList(ListNode head) {
        ListNode p = head;
        while (p != null) {
            System.out.print(String.format("%s -> ", p.val));
            p = p.next;
        }
        System.out.println("null");
    }

    static ListNode intArrayToListNode(int[] arr) {
        if (arr.length == 0) {
            return null;
        }

        ListNode head = new ListNode(arr[0]);
        ListNode p = head;

        for (int i = 1; i < arr.length; i++) {
            p.next = new ListNode(arr[i]);
            p = p.next;
        }

        return head;
    }
}
