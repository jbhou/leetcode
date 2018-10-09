package leetcode.linkedlist;

public class SoluationOddEvenList {


    public static void main(String[] args) {


        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        ListUtils.printList(n1);

        ListNode n = oddEvenList(n1);
        ListUtils.printList(n);

    }


    public static ListNode oddEvenList(ListNode head) {

        if (head == null) {
            return null;
        }

        int index = 1;
        ListNode oddHead = new ListNode(0);
        ListNode evenHead = new ListNode(0);
        ListNode current = head;
        ListNode p1 = oddHead;
        ListNode p2 = evenHead;
        while (current != null) {
            if (index++ % 2 != 0) {
                p1.next = current;
                p1 = p1.next;
                p2.next=null;
            } else {
                p2.next = current;
                p2 = p2.next;
                p1.next=null;
            }
            current = current.next;
        }
        p1.next = evenHead.next;
        return oddHead.next;


    }
}
