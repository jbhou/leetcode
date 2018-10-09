package leetcode.linkedlist;

import leetcode.linkedlist.ListNode;

public class ListUtils {


    public static void printList(ListNode head) {


        ListNode node = head;
        while (node != null) {
            System.err.print(node + "-");
            node = node.next;
        }
        System.err.println("null");
    }


    public static ListNode createNewList() {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node31 = new ListNode(3);
        ListNode node32 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(2);
        ListNode node8 = new ListNode(1);
        ListNode node9 = new ListNode(3);
        ListNode node10 = new ListNode(1);
        ListNode node11 = new ListNode(5);

        head.next = node2;
        node2.next = node3;
        node3.next = node31;
        node31.next = node32;
        node32.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = node10;
        node10.next = node11;
        return head;
    }


    public static ListNode createNewListWithCycle() {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node31 = new ListNode(3);
        ListNode node32 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        head.next = node2;
        node2.next = node3;
        node3.next = node31;
        node31.next = node32;
        node32.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node2;
        return head;
    }

}
