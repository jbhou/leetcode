package leetcode.linkedlist;

public class SolutionSwapPairs {


    public static void main(String[] args) {


        ListNode head = ListUtils.createGeneralList(5);
        ListUtils.printList(head);
        ListNode newH = swapPairs2(head);
        ListUtils.printList(newH);

    }


    public static ListNode swapPairs(ListNode head) {


        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode current = newHead;

        while (current.next != null && current.next.next != null) {
            ListNode a = current.next;
            ListNode b = current.next.next;
            a.next = b.next;
            current.next = b;
            b.next = a;
            current = a;
        }
        return newHead.next;
    }


    public static ListNode swapPairs2(ListNode head) {


        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode cur = dummy;

        while (cur.next != null && cur.next.next != null) {
            ListNode a = cur.next;
            ListNode b = a.next;

            a.next = b.next;
            b.next = a;
            cur.next = b;
            cur = a;


        }


        return dummy.next;


    }


}
