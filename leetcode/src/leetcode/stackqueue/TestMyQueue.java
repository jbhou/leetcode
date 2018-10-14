package leetcode.stackqueue;

public class TestMyQueue {


    public static void main(String[] args) {

        MyQueue q = new MyQueue();


        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);

        while (!q.empty()) {
//            System.err.println(q.peek());
            System.err.println(q.pop());
        }
        q.push(5);
        q.push(6);
        q.push(7);


        while (!q.empty()) {
//            System.err.println(q.peek());
            System.err.println(q.pop());
        }


    }
}
