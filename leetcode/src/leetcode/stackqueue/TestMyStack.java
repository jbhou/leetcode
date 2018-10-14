package leetcode.stackqueue;

public class TestMyStack {

    public static void main(String[] args) {
        MyStack s= new MyStack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);

        while(!s.empty()){
            System.err.println(s.top());
            System.err.println(s.pop());
        }
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        while(!s.empty()){
            System.err.println(s.top());
            System.err.println(s.pop());
        }

    }
}
