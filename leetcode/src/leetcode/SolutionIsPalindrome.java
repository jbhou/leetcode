package leetcode;

public class SolutionIsPalindrome {


    public static void main(String[] args) {


        String s = "v' 5:UxU:5 v'";
        new SolutionIsPalindrome().isPalindrome(s);


    }

    public boolean isPalindrome(String s) {
        if (s == null || "".equals(s.trim())) {
            return true;
        }

        s = s.replace(" ", "").toLowerCase();

        int len = s.length();
        for (int i = 0, j = len - 1; i < j; ) {

            char ci = s.charAt(i);
            char cj = s.charAt(j);
            if (((('a' <= ci && ci <= 'z') || ('0' <= ci && '9' >= ci)) && (('a' <= cj && cj <= 'z') || ('0' <= cj && '9' >= cj)))) {
                if (ci != cj) {
                    return false;
                }
                i++;
                j--;
            } else {
                if (!('a' <= ci && ci <= 'z') && !('0' <= ci && '9' >= ci)) {
                    i++;
                }
                if (!('a' <= cj && cj <= 'z') && !('0' <= cj && '9' >= cj)) {
                    j--;
                }
            }
        }
        return true;

    }


}
