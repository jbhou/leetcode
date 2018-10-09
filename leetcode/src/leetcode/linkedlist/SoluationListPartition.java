package leetcode.linkedlist;



public class SoluationListPartition {

    public static void main(String[] args) {


        ListNode head = ListUtils.createNewList();
        System.err.println("Init:");
        ListUtils.printList(head);

        ListNode newHead = partition(head, 3);
        System.err.println("After:");
        ListUtils.printList(newHead);


    }


    public static ListNode partition(ListNode head, int x) {
        if (head == null) {
            return null;
        }
        ListNode smallHead = new ListNode(0);
        ListNode p1 = smallHead;
        ListNode bigHead =  new ListNode(0);
        ListNode p2 = bigHead;
        ListNode current = head;


        while (current != null) {
            if (current.val < x) {
                    p1.next = current;
                    p1 = p1.next;
                    p2.next=null;
            } else {
                    p2.next = current;
                    p2 = p2.next;
                    p1.next=null;
            }
            current = current.next;
        }
        p1.next = bigHead.next;
        return smallHead.next;
    }

}
