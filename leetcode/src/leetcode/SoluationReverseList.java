package leetcode;

public class SoluationReverseList {


    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = null;

        ListNode newList = reverse(head);


        System.err.println("after:");
        while (newList != null) {
            System.err.println(newList);
            newList = newList.next;
        }

    }

    private static ListNode reverse(ListNode head) {


        ListNode next = null;
        ListNode previous = null;
        ListNode newHead = null;
        ListNode current = head;
        while (current != null) {


            next = current.next;
            if (next == null) {
                newHead = current;
            }
            current.next = previous;
            previous = current;
            current = next;
        }
        return newHead;


    }
}
