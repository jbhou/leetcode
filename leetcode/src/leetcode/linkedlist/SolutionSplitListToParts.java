package leetcode.linkedlist;

public class SolutionSplitListToParts {


    public static void main(String[] args) {

        ListNode head = ListUtils.createGeneralList(7);
        System.err.println("before :");
        ListUtils.printList(head);
        ListNode[] res = splitListToParts(head, 9);
        for (int i = 0; i < res.length; i++) {
            ListUtils.printList(res[i]);

        }


    }

    public static ListNode[] splitListToParts(ListNode root, int k) {

        ListNode[] listNodes = new ListNode[k];
        if (root == null) {
            return listNodes;
        }
        int length = 0;

        ListNode current = root;
        do {
            length++;
        } while ((current = current.next) != null);

        ListNode partitionHead = root;
        current = partitionHead;

        if (length < k) {
            for (int i = 0; i < length; i++) {
                listNodes[i] = partitionHead;
                current = partitionHead.next;
                partitionHead.next = null;
                partitionHead = current;
            }
            return listNodes;
        }


        int avgCount = length / k;
        int m = length % k;//前m个比avg 大1


        for (int i = 0; i < k; i++) {
            listNodes[i] = partitionHead;
            current = partitionHead;
            if (current == null) {
                break;
            }
            for (int j = 1; j < avgCount; j++) {
                current = current.next;
            }
            if (i < m) {
                current = current.next;
            }
            partitionHead = current.next;
            current.next = null;
        }
        return listNodes;


    }


}
