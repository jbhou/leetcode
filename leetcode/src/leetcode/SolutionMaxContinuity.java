package leetcode;

public class SolutionMaxContinuity {


    public static void main(String[] args) {


        String s = "aaab";

        length(s, 0);
        System.err.println(max);
    }


    static int max = 0;
    static int curStrLength = 1;

    public static void length(String s, int curIdx) {


        if (curIdx >= s.length()) {
            return;
        }

        if (curIdx >= 1) {
            if (s.charAt(curIdx - 1) == s.charAt(curIdx)) {
                curStrLength += 1;
            } else {
                curStrLength = 1;
            }
        }
        if (max < curStrLength) {
            max = curStrLength;
        }
        length(s, curIdx + 1);


    }


}
