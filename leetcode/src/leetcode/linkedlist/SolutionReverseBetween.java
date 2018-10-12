package leetcode.linkedlist;

public class SolutionReverseBetween {


    public static void main(String[] args) {
        ListNode head = ListUtils.createGeneralList(6);


        ListUtils.printList(head);
        ListUtils.printList(reverseBetween(head, 1, 3));
    }


    public static ListNode reverseBetween(ListNode head, int m, int n) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        int index = 1;
        ListNode previous = null;
        ListNode current = head;
        ListNode next = null;

        for (; index < m - 1; index++) {
            current = current.next;
        }
        ListNode a = null;
        if (m == 1) {
            a = dummy;
        } else {
            a = current;
        }
        ListNode b = a.next;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;

            if (index == n) {
                a.next = current;
                break;
            }
            current = next;
            index++;
        }
        b.next = next;

        return dummy.next;


    }


}
