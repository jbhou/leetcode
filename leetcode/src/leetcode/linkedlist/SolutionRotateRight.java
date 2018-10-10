package leetcode.linkedlist;

/**
 * 链表旋转
 */
public class SolutionRotateRight {


    public static void main(String[] args) {


        ListNode head = ListUtils.createNewList();
        ListUtils.printList(head);
        ListNode newHead = rotateRight(head, 3);
        ListUtils.printList(newHead);


    }


    public static ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null || head.next == null) {
            return head;
        }

        int length = 0;

        ListNode current = head;
        ListNode tail = null;
        while (current != null) {
            length++;
            if (current.next == null) {
                current.next = head;
                tail = current;
                break;
            }
            current = current.next;
        }

        int k1 = length - k % length;   // 注意左旋还是右旋
        current = head;
        for (int i = 0; i < k1; i++) {
            current = current.next;
            tail = tail.next;
        }
        tail.next = null;
        return current;
    }


}
