package leetcode.stack;

import java.util.Stack;

public class SolutionMinAddToMakeValid {


    public static void main(String[] args) {

        System.err.println(new SolutionMinAddToMakeValid().minAddToMakeValid("()))(("));

    }


    public int minAddToMakeValid(String S) {

        Stack<Character> stack = new Stack<>();


        for (int i = 0; i < S.length(); i++) {

            char c = S.charAt(i);

            if (stack.empty()) {
                stack.push(c);
            } else {
                if (c == ')' && stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }
        return stack.size();


    }
}
