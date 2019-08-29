package leetcode.interview.bytedance;

public class ByteDanceReverseWords1 {


    /*给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。

    示例 1:

    输入: "Let's take LeetCode contest"
    输出: "s'teL ekat edoCteeL tsetnoc"
    注意：在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。*/
    public String reverseWords(String s) {

        if (s == null || s.trim().length() == 0) return s;

        StringBuffer result = new StringBuffer();

        String[] splited = s.split(" ");
        for (int i = 0; i < splited.length; i++) {
            String subString = splited[i];
            result.append(reverse(subString)).append(" ");
        }

        return result.toString().trim();


    }


    public String reverse(String s) {
        String r = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            r += s.charAt(i);
        }

        return r;


    }
}
