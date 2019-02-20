package leetcode.stack;

import java.util.Stack;

public class SolutionValidateStackSequences {


    public static void main(String[] args) {


        int[] a = new int[]{1,0};
        int[] b = new int[]{1,0};


        boolean res = new SolutionValidateStackSequences().validateStackSequences(a, b);
        System.err.println(res
        );
    }


    public boolean validateStackSequences(int[] pushed, int[] popped) {
// 1 2 3 4 5
        // 4 5 3 2 1

        Stack<Integer> stack = new Stack<>();

        int j = 0;
        for (int i = 0; i < pushed.length; i++) {

            stack.push(pushed[i]);

            while (j < popped.length  && !stack.empty() && stack.peek() == popped[j]) {
                j++;
                stack.pop();
            }
        }

        while (j < popped.length) {
            if (popped[j++] != stack.pop()) {
                return false;
            }
        }

        return true;

    }


}
