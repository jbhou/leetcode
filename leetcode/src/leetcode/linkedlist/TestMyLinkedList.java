package leetcode.linkedlist;

public class TestMyLinkedList {


    public static void main(String[] args) {

        MyLinkedList myLinkedList= new MyLinkedList();

//        myLinkedList.addAtHead(1);
//
//        ListUtils.printList(myLinkedList.head);

//        myLinkedList.addAtTail(3);
//        ListUtils.printList(myLinkedList.head);
        myLinkedList.addAtIndex(0,1);

        System.err.println(myLinkedList.get(0));
        ListUtils.printList(myLinkedList.head);


        myLinkedList.deleteAtIndex(1);
        ListUtils.printList(myLinkedList.head);

        System.err.println(myLinkedList.get(1));


    }













}
