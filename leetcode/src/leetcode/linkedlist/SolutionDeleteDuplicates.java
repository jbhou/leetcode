package leetcode.linkedlist;

import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import java.util.HashSet;
import java.util.Set;

public class SolutionDeleteDuplicates {


    public static void main(String[] args) {

        ListNode h = ListUtils.createNewList();
        ListUtils.printList(h);
        ListNode nh = deleteDuplicates(h);
        ListUtils.printList(nh);
    }


    public static ListNode deleteDuplicates(ListNode head) {


        if (head == null || head.next == null) {
            return head;
        }
        Set<Integer> set = new HashSet<>();
        Set<Integer> removeValue = new HashSet<>();
        ListNode current = head;
        while (current != null) {
            if (set.contains(current.val)) {
                removeValue.add(current.val);
            } else {
                set.add(current.val);
            }
            current = current.next;
        }

        ListNode newHead = new ListNode(0);
        newHead.next = head;


        current = newHead;
        ListNode next = current.next;

        while (current != null) {
            if (next!=null && removeValue.contains(next.val)) {
                do {
                    next = next.next;
                } while (next != null && removeValue.contains(next.val));
            }
            current.next = next;
            current = current.next;
            if (next != null)
                next = next.next;
        }
        return newHead.next;


    }
}
