package leetcode.linkedlist;


/**
 * 查找链表的中间节点
 */
public class SoluationMiddleNode {


    public static void main(String[] args) {

        ListNode head = ListUtils.createNewList();
        ListUtils.printList(head);

        ListNode mid = middleNode(head);
        System.err.println("mid:" + mid);


    }


    /**
     * 还可以用快慢指针，快的到终点，慢的到中间
     *
     * @param head
     * @return
     */


    public static ListNode middleNode(ListNode head) {


        if (head.next == null) {
            return head;
        }

        int length = 1;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }


        int midIndex = length / 2 + 1;
        ListNode p1 = head;
        ListNode p2 = head;
        for (int i = 1; i < midIndex; i++) {
            p1 = p1.next;
        }

        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;

    }


}
