package leetcode.sort;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 字母异味词
 * https://leetcode-cn.com/problems/valid-anagram/description/
 */
public class SolutionIsAnagram {


    public static void main(String[] args) {


//        String s = "adcbac";
//        char[] chars = s.toCharArray();//aabccd
//        sort(chars);
//        for (int i = 0; i < chars.length; i++) {
//            System.err.print(chars[i]);
//        }
        String s = "a";
        String t = "b";
        isAnagram(s, t);


    }

    public static boolean isAnagram(String s, String t) {


        if (t.length() != s.length()) return false;

        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();

        sort(c1);
        sort(c2);

        for (int i = 0; i < c2.length; i++) {

            if (c1[i] != c2[i]) {
                return false;
            }
        }
        return true;


    }

    private static void sort(char[] chars) {

        if (chars.length <= 1) {
            return;
        }

        for (int i = 0; i < chars.length; i++) {

            int j = i - 1;
            char c = chars[i];
            for (; j >= 0; j--) {
                if (c < chars[j]) {
                    chars[j + 1] = chars[j];
                } else {
                    break;
                }
            }
            chars[j + 1] = c;
        }


    }
}
