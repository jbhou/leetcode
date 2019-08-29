package leetcode.interview;

import leetcode.linkedlist.ListNode;
import leetcode.linkedlist.ListUtils;

public class GeekSolutionSortLinklist {


    /**
     * 在 O(n log n) 时间复杂度和常数级空间复杂度下，对链表进行排序。
     * <p>
     * 示例 1:
     * <p>
     * 输入: 4->2->1->3
     * 输出: 1->2->3->4
     * 示例 2:
     * <p>
     * 输入: -1->5->3->4->0
     * 输出: -1->0->3->4->5
     */


    public ListNode sortList(ListNode head) {


        if (head == null || head.next == null) {
            return head;
        }


        ListNode end = head;
        while (end.next != null) {
            end = end.next;
        }

        qSort(head, end);
        return head;

    }

    private void qSort(ListNode head, ListNode end) {

        if (head == null || head == end || end == null) {
            return;
        }

        ListNode p = partition(head, end);

        qSort(head, p);
        ListNode pNext = p.next == null ? p : p.next;
        qSort(pNext, end);

    }

    private ListNode partition(ListNode head, ListNode end) {
        if (head == null || end == head) {
            return head;
        }

        ListNode pivot = end;
        int pValue = pivot.val;
        ListNode i = head, j = head;
        ListNode retNode = head;

        for (; j != null && j != end; j = j.next) {

            if (j.val < pValue) {
                int t = i.val;
                i.val = j.val;
                j.val = t;
                retNode = i;
                i = i.next;
            }
        }


        end.val = i.val;
        i.val = pValue;
        return retNode;
    }


    public void quickSort2(ListNode head) {

        ListNode cur = head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }

        doQuickSort2(head,0,count);




    }

    private void doQuickSort2(ListNode head, int i, int count) {

















    }


    public static void main(String[] args) {


        ListNode l1 = new ListNode(4);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(1);
        ListNode l4 = new ListNode(3);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;

        ListUtils.printList(l1);
        new GeekSolutionSortLinklist().sortList(l1);
        ListUtils.printList(l1);
    }
}
