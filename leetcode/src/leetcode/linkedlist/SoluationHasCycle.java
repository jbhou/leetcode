package leetcode.linkedlist;

public class SoluationHasCycle {


    public static void main(String[] args) {


        ListNode listNode = ListUtils.createNewListWithCycle();
//        ListNode listNode = ListUtils.createNewList();

        System.err.println("listNode:");
//        ListUtils.printList(listNode);
        boolean b = hasCycle(listNode);
        System.err.println("has Cycle:" + b);

    }

    public static boolean hasCycle(ListNode head) {

        if (head == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != null && fast != null) {
            if (slow == fast) {
                return true;
            }
            slow = slow.next;
            if (fast.next != null)
                fast = fast.next.next;
            else
                break;
        }

        return false;

    }


}
