package leetcode;

public class SolutionRotateString {


    public boolean rotateString(String a, String b) {

        if (a.length() != b.length()) {
            return false;
        }
        if (a.equals(b)) {
            return true;
        }

        String s2 = a + a;
        return s2.contains(b);
    }


}
