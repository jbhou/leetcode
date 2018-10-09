package leetcode.linkedlist;


import java.util.List;

/**
 * 相交链表
 *
 * 查找链表相交的两点
 * 思想：先将长链表指针p1向后移动链表差|p1-p2|的距离，再同时移动两个指针，p1,p2
 *
 */
public class SoluationGetIntersectionNode {


    public static void main(String[] args) {


        ListNode head1 = new ListNode(1);
//        ListNode head2 = new ListNode(10);
        ListNode node2 = new ListNode(2);
        head1.next = node2;
//        head2.next = node2;
        node2.next = new ListNode(3);

        ListNode c = getIntersectionNode(head1, node2);
        System.err.println(c);

    }


    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {


        int size1 = 0;
        int size2 = 0;
        ListNode p1 = headA;
        ListNode p2 = headB;

        while (p1 != null || p2 != null) {
            if (p1 != null) {
                size1++;
            }
            if (p2 != null) {
                size2++;
            }
            if (p1 != null)
                p1 = p1.next;
            if (p2 != null)
                p2 = p2.next;
        }
        int l = 0;
        if (size1 > size2) {
            p1 = headA;
            p2 = headB;
            l = size1 - size2;
        } else {
            p1 = headB;
            p2 = headA;
            l = size2 - size1;
        }
        int i = 0;
        while (i++ < l) {
            p1 = p1.next;
        }

        while (p1 != null && p2 != null) {
            if (p1 == p2) {
                return p1;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        return null;

    }


}
