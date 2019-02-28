package leetcode;

import java.util.StringJoiner;

public class SolutionReverseWords {

    public static void main(String[] args) {

        String s = "I am a Student.";
        System.err.println(new SolutionReverseWords().reverseWords(s));

    }


    public String reverseWords(String s) {

        String newS = reverse(s);


        String[] splited = newS.split(" ");

        String res = "";
        for (int i = 0; i < splited.length; i++) {
            if (!"".equals(splited[i].trim())) {
                res += reverse(splited[i]) + " ";
            }
        }

        return res.substring(0, res.length() - 1);


    }


    public String reverse(String s) {


        String r = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            r += s.charAt(i);
        }
        return r;


    }


}
