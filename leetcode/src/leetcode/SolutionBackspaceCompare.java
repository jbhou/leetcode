package leetcode;

import java.util.Stack;

public class SolutionBackspaceCompare {


    public static void main(String[] args) {

        SolutionBackspaceCompare s = new SolutionBackspaceCompare();

        System.err.println(s.backspaceCompare("xywrrmp",   "xywrrmu#p"));
//        System.err.println(new SolutionBackspaceCompare().backspaceCompare("",""));
    }


    public boolean backspaceCompare(String S, String T) {

        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == '#') {
                if (s1.size() > 0)
                    s1.pop();
            } else {
                s1.push(c);
            }
        }
        for (int j = 0; j < T.length(); j++) {
            char c = T.charAt(j);
            if (c == '#') {
                if (s2.size() > 0)
                    s2.pop();
            } else {
                s2.push(c);
            }
        }

        String r1 = "";
        String r2 = "";
        while (s1.size() > 0) {
            r1 += s1.pop();
        }
        while (s2.size() > 0) {
            r2 += s2.pop();
        }

        return r1.equals(r2);

    }

}