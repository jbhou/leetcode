package leetcode.stackqueue;

import java.util.Stack;

public class SolutionSimplifyPath {


    public static void main(String[] args) {
//        String path = "/../";
//        String path = "/home/s1/s2";
        String path = "/a/./b/../../c/";
        System.err.println(simplifyPath(path));

    }

    public static String simplifyPath(String path) {

        Stack<String> stack = new Stack<>();

        String s[] = path.split("/");


        for (int i = 0; i < s.length; i++) {
            if (s[i].equals("") || s[i].equals(".")) {
                continue;
            }
            if (s[i].equals("..")) {
                if (!stack.empty())
                    stack.pop();
                continue;
            }
            stack.push(s[i]);
        }

        String p = "/";
        while (!stack.empty()) {
            p = "/" + stack.pop() + p;
        }
        if (p.endsWith("/") && p.length() > 1) {
            return p.substring(0, p.length() - 1);
        }

        return p;


    }
}
