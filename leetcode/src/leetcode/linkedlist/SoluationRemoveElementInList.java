package leetcode.linkedlist;

/**
 * 删除链表中节点，思想:建立一个锚点为新的链表头
 */
public class SoluationRemoveElementInList {


    public static void main(String[] args) {

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

        System.err.println("before");
        ListUtils.printList(head);


        node6.next = null;

        ListNode newHead = removeElements(head, 6);

        System.err.println("after");
        ListUtils.printList(newHead);

    }


    public static ListNode removeElements(ListNode head, int val) {

        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode current = newHead;
        ListNode next = current.next;

        while (next != null) {
            if (next.val != val) {
                current.next = next;
                current = current.next;
                next = next.next;
            } else {
                do {
                    next = next.next;
                    if (next == null) {
                        current.next = null;
                    }
                } while (next != null && next.val == val);
            }
        }
        return newHead.next;
    }


}
