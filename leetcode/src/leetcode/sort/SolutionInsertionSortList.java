package leetcode.sort;

import leetcode.linkedlist.ListNode;
import leetcode.linkedlist.ListUtils;

public class SolutionInsertionSortList {


    public static void main(String[] args) {

//        ListNode list = ListUtils.createNewList();
        ListNode list = new ListNode(1);
        ListNode l2 = new ListNode(2);
        l2.next = list;
        ListUtils.printList(l2);
        ListNode newList = insertionSortList(l2);
        ListUtils.printList(newList);

    }


    public static ListNode insertionSortList(ListNode listNode) {


        if (listNode == null || listNode.next == null) {
            return listNode;
        }


        ListNode p1 = null;
        ListNode curent = listNode.next;
        ListNode next = curent.next;
        ListNode newHead = listNode;
        newHead.next = null;

        while (curent != null) {
            next = curent.next;
            if (curent.val < newHead.val) {
                curent.next = newHead;
                newHead = curent;
                curent = next;
                continue;
            }
            p1 = newHead;

            while (p1 != null && p1.next != null) {
                if (p1.val <= curent.val && curent.val < p1.next.val) {
                    break;
                } else {
                    p1 = p1.next;
                }
            }
            curent.next = p1.next;
            p1.next = curent;
            curent = next;

        }

        return newHead;


    }
}
