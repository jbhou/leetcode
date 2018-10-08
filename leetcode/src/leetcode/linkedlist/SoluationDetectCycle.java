package leetcode.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class SoluationDetectCycle {


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
        node6.next = node2;


        ListNode node = detectCycle(head);
        System.err.println(node);

    }

    private static ListNode detectCycle(ListNode head) {


        if (head == null) {
            return null;
        }
        ListNode p2 = head;

        Set<ListNode> set = new HashSet<>();
        while (p2 != null) {
            if (set.contains(p2)) {
                return p2;
            }
            set.add(p2);
            p2 = p2.next;
        }
        return null;
    }

}
