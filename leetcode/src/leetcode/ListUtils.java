package leetcode;

public class ListUtils {


    public static void printList(ListNode head) {


        ListNode node = head;
        while (node != null) {
            System.err.print(node + "-");
            node = node.next;
        }
        System.err.println("null");

    }


}
