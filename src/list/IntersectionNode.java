package list;

public class IntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA;

        while (p1 != null) {
            ListNode p2 = headB;
            while (p2 != null) {
                if (p1 == p2) {
                    return p1;
                }
                p2 = p2.next;
            }
            p1 = p1.next;
        }
        return null;
    }
}
