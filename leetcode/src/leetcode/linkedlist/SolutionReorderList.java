package leetcode.linkedlist;

public class SolutionReorderList {

    /**
     * 先找到中间位置，再把后半段链表反转，再与前半段交替合并
     *
     * @param args
     */

    public static void main(String[] args) {


        ListNode head = ListUtils.createGeneralList(9);
        ListUtils.printList(head);
        reorderList(head);
        ListUtils.printList(head);
    }


    public static void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return;
        }
        ListNode fast = head;
        ListNode slow = head;
        ListNode pre = head;


        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            pre = pre.next;
            slow = pre.next;
        }

        pre.next = null;
        ListNode newHead = reverse(slow);
        ListNode p1 = head;
        ListNode p2 = newHead;

        ListNode ret = p1;
        while (p1 != null && p2 != null) {
            ListNode p1Next = p1.next;
            ListNode p2Next = p2.next;
            p1.next = p2;
            p1 = p1Next;
            p2.next = p1;
            p2 = p2Next;
        }
    }


    public static ListNode reverse(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode next = cur.next;
        ListNode newHead = null;
        while (cur != null) {
            next = cur.next;
            if (next == null) {
                newHead = cur;
            }
            cur.next = pre;
            pre = cur;
            cur = next;
        }

        return newHead;
    }


}

