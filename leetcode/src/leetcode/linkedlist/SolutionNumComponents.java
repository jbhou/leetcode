package leetcode.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class SolutionNumComponents {


    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(4);
        ListNode n4 = new ListNode(5);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        int G[] = new int[]{1, 4, 5};
        ListUtils.printList(head);
        System.err.println(numComponents(head, G));


    }


    public static int numComponents(ListNode head, int[] G) {

        if (head.next == null) {
            return 1;
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < G.length; i++) {
            set.add(G[i]);
        }

        ListNode current = head;
        ListNode next = current.next;

        int count = 0;
        while (next != null) {
            if (set.contains(current.val) && !set.contains(next.val)) {
                count++;
            }

            current = current.next;
            next = next.next;
        }
        if (set.contains(current.val)) {
            count++;
        }

        return count;
    }


}
