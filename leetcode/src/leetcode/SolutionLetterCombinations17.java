package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SolutionLetterCombinations17 {


    public static void main(String[] args) {


        List<String> l = new SolutionLetterCombinations17().letterCombinations("234");
        System.err.println(l);
    }

    Map<Character, String> map = new HashMap<Character, String>() {{
        put('2', "abc");
        put('3', "def");
        put('4', "ghi");
        put('5', "jkl");
        put('6', "mno");
        put('7', "pqrs");
        put('8', "tuv");
        put('9', "wxyz");
    }};


    public List<String> letterCombinations(String digits) {


        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }

        String[] s = new String[digits.length()];
        for (int i = 0; i < digits.length(); i++) {
            s[i] = map.get(digits.charAt(i));
        }


        getStringWithFor(s, 0, result, "");
        return result;

    }


    private void getStringWithFor(String[] s, int i, List<String> list, String stemp) {

        if (i < s.length - 1) {
            for (int j = 0; j < s[i].length(); j++) {
                getStringWithFor(s, i + 1, list, stemp + s[i].charAt(j));
            }
        } else {
            for (int j = 0; j < s[i].length(); j++) {
                list.add(stemp + s[i].charAt(j));
            }
        }

    }


}
