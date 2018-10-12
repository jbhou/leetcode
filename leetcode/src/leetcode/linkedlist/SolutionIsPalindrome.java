package leetcode.linkedlist;

public class SolutionIsPalindrome {


    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        ListNode n2 = new ListNode(2);
//        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(2);
        ListNode n5 = new ListNode(2);

        head.next=n2;
        n2.next=n4;
//        n3.next=n4;
        n4.next=n5;
        System.err.println(isPalindrome(head));


    }


    public static boolean isPalindrome(ListNode head) {
        if(head==null){
            return true;
        }
        if (head.next == null) {
            return true;
        }
        if (head.next.next == null) {
            if (head.val == head.next.val) {
                return true;
            } else {
                return false;
            }
        }

        ListNode fast = head;
        ListNode slow = head;


        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode newHead = null;
        if (fast != null) {//说明链表共有奇数个节点
            newHead = reverseList(slow.next);

        } else {//说明链表有偶数个节点
            newHead = reverseList(slow);
        }
        ListNode p1 = head;
        ListNode p2 = newHead;
        while (p1 != null && p2 != null) {
            if (p1.val != p2.val) {
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;

    }

    public static ListNode reverseList(ListNode head) {

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
