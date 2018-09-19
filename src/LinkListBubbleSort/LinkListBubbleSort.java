package LinkListBubbleSort;

public class LinkListBubbleSort {

    class Node {
        int val;
        Node next = null;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void sort(Node head) {
        Node cur = head;
        Node tail = null;
        while (cur != tail) {
            while (cur.next != tail) {
                if (cur.val > cur.next.val) {
                    int temp = cur.val;
                    cur.val = cur.next.val;
                    cur.next.val = temp;
                }
                cur = cur.next;
            }
            tail = cur;
            cur = head;
        }
    }

    public static void main(String[] args) {

    }
}
