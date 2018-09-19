package reverseList;

class ListNode{
    int val;
    ListNode next;
}

public class ReverseList {

    /**
     * 迭代，将指针反过来
     */
//    public ListNode reverseList(ListNode head) {
//        ListNode newhead = null;
//        while (head != null) {
//            ListNode next= head.next;
//            head.next = newhead;
//            newhead = head;
//            head = next;
//        }
//        return newhead;
//    }

    /**
     * 递归(思路和迭代一样，只不过换成了递归）
     */
    public ListNode reverse(ListNode head, ListNode newHead) {
        if (head == null) {
            return newHead;
        }
        ListNode next = head.next;
        head.next = newHead;
        return reverse(next, head);
    }

    public ListNode reverseList(ListNode head) {
        return reverse(head, null);
    }
}
