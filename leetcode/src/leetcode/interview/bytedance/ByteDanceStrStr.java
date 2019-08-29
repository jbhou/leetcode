package leetcode.interview.bytedance;

public class ByteDanceStrStr {
    public static void main(String[] args) {
        int i = new ByteDanceStrStr().strStr("mississippi", "issip");
        System.err.println(i);
    }

    //    实现 strStr() 函数。
//
//    给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
//
//    示例 1:
//
//    输入: haystack = "hello", needle = "ll"
//    输出: 2
//    示例 2:
//
//    输入: haystack = "aaaaa", needle = "bba"
//    输出: -1
//    说明:
//
//    当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
//
//    对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return -1;
        }
        if (haystack.equals("")) {

            return needle.equals("") ? 0 : -1;
        }
        if (needle.equals("")) {
            return 0;
        }

        /**
         * 1：暴力匹配O(M*N)
         * 2:使用subString
         * 3：使用split
         * 4：KMP
         */

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            if (haystack.charAt(i) == needle.charAt(0)) {
                int k = i;
                int j = 0;
                while (j < needle.length()) {
                    //12345
                    //  345
                    char c1 = haystack.charAt(k);
                    char c2 = needle.charAt(j);
                    if (c1 != c2) {
                        break;
                    }
                    k++;
                    j++;
                }
                if (j >= needle.length()) return i;
            }
        }
        return -1;
    }


}
