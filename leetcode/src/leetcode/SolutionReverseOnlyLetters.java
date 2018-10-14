package leetcode;

import java.util.HashMap;
import java.util.Map;

public class SolutionReverseOnlyLetters {
    public static void main(String[] args) {

        String a = "abcd-ab";

        System.err.println(reverseOnlyLetters(a));


    }


    public static String reverseOnlyLetters(String S) {

        char[] chars = new char[S.length()];
        S.getChars(0, S.length(), chars, 0);

        int i = 0, j = S.length() - 1;
        while (i < j) {
            char c1 = chars[i];

            if ((c1 <= 'Z' && c1 >= 'A') || (c1 <= 'z' && c1 >= 'a')) {
                char c2 = chars[j];
                if ((c2 <= 'Z' && c2 >= 'A') || (c2 <= 'z' && c2 >= 'a')) {
                    chars[i] = c2;
                    chars[j] = c1;
                    i++;
                    j--;
                } else {
                    j--;
                    continue;
                }
            } else {
                i++;
            }
        }
        return new String(chars);

    }

}
