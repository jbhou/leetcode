package leetcode.linkedlist;


import java.util.HashSet;
import java.util.Set;

public class SoluationDeleteDuplicates {


    public static void main(String[] args) {
        ListNode head = ListUtils.createNewList();
        ListUtils.printList(head);
        ListNode newHead = deleteDuplicates(head);
        ListUtils.printList(newHead);
    }


    public static ListNode deleteDuplicates(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;
        ListNode next = current.next;

        Set<Integer> set = new HashSet<>();
        set.add(current.val);

        while (next != null) {
            if (set.contains(next.val)) {
                do {
                    next = next.next;
                } while (next != null && set.contains(next.val));
            }
            current.next = next;
            if (next != null) {
                current = current.next;
                set.add(next.val);
                next = next.next;
            }
        }

        return head;

    }


}
