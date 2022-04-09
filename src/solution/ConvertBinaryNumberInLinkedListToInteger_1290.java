package solution;


//Given head which is a reference node to a singly-linked list.
// The value of each node in the linked list is either 0 or 1.
// The linked list holds the binary representation of a number.
//
//Return the decimal value of the number in the linked list.



public class ConvertBinaryNumberInLinkedListToInteger_1290 {
    public int getDecimalValue(ListNode head) {

        int sum = head.val;
        while (head.next != null) {

            sum = sum * 2 + head.next.val;
            head = head.next;
        }

        return sum;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
