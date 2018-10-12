package leetcode.linkedlist;


public class SolutionAddTwoNumbers {


    public static void main(String[] args) {

        ListNode l1 = ListUtils.createGeneralList(6);
        ListNode l2 = ListUtils.createGeneralList(6);
        ListUtils.printList(l2);
        ListUtils.printList(l1);
        ListNode l3 = addTwoNumbers(l1, l2);
        ListUtils.printList(l3);

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode l3 = dummy;
        ListNode p1 = l1;
        ListNode p2 = l2;

        while (p1 != null || p2 != null) {
            int sum = p1.val + p2.val;
            if (sum >= 10) {
                l3.next = new ListNode(sum / 10);
                l3 = l3.next;
            }
            l3.next = new ListNode(sum % 10);
            l3 = l3.next;

            p1 = p1.next;
            p2 = p2.next;
        }
        return dummy.next;
    }


}
