package leetcode.linkedlist;

public class MyLinkedList {


    private int val;
    public MyLinkedList next;
    public MyLinkedList head;
    private int size;

    /**
     * Initialize your data structure here.
     */
    public MyLinkedList() {
    }


    private MyLinkedList(int v) {
        this.val = v;
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        MyLinkedList p = head;
        for (int i = 0; i < index; i++) {
            p = p.next;
        }
        return p.val;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        MyLinkedList node = new MyLinkedList(val);
        node.next = head;
        head = node;
        size++;
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        MyLinkedList node = new MyLinkedList(val);

        if (head == null) {
            head = node;
            size++;
            return;
        }
        MyLinkedList p = head;
        while (p.next != null) {
            p = p.next;
        }
        p.next = node;
        size++;
    }


    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        if (index > size || index < 0) {
            return;
        }
        if (size == index) {
            addAtTail(val);
            return;
        }

        if (index == 0) {
            addAtHead(val);
            return;
        }


        MyLinkedList node = new MyLinkedList(val);
        MyLinkedList p = head;
        for (int i = 1; i < index; i++) {
            p = p.next;
        }
        node.next = p.next;
        p.next = node;
        size++;
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        if (index >= size || index < 0) {
            return;
        }
        if (index == 0 && head != null) {
            head = head.next;
            return;
        }

        MyLinkedList p = head;
        for (int i = 1; i < index; i++) {
            p = p.next;
        }
        p.next = p.next.next;
        size--;
    }


    @Override
    public String toString() {
        return "" + val;
    }
}