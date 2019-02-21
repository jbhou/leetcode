package leetcode.linkedlist;

public class SolutionSortList {


    public static void main(String[] args) {


        ListNode list = ListUtils.createNewList();

        ListUtils.printList(list);

        new SolutionSortList().sortList(list);
        ListUtils.printList(list);


    }


    public ListNode sortList(ListNode head) {


        if (head == null || head.next == null) {
            return head;
        }

        ListNode end = head;
        while (end.next != null) {
            end = end.next;
        }


        quickSort(head, end);
        return head;

    }

    private void quickSort(ListNode head, ListNode end) {


        if (head == null || head == end) {
            return;
        }
        ListUtils.printList(head);
        ListNode pNode = partition(head, end);

        quickSort(head, pNode);
        ListNode pNodeNext = pNode.next;

        if (pNodeNext == null) {
            pNodeNext = pNode;
        }
        quickSort(pNodeNext, end);
    }


    private ListNode partition(ListNode begin, ListNode end) {
        if (begin == null || begin == end) {
            return begin;
        }

        ListNode i = begin, j = begin;
        ListNode retNode = begin;
        ListNode pivot = end;
        int pivotVal = end.val;
        for (; j != end && j != null; j = j.next) {

            if (j.val < pivotVal) {
                int t = j.val;
                j.val = i.val;
                i.val = t;
                retNode = i;
                i = i.next;

            }
        }
        pivot.val = i.val;
        i.val = pivotVal;
        return retNode;
    }


    void print(ListNode head, ListNode end) {
        ListNode p = head;
        while (p != null && p != end) {

            System.err.print("-" + p.val);
            p = p.next;

        }
        System.err.println();


    }

}
