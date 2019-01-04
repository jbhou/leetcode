package leetcode;

import java.util.HashMap;
import java.util.Map;

public class SolutionRomanToInt {


    public static void main(String[] args) {


        assert 1994 == romanToInt("MCMXCIV");
        assert 4 == romanToInt("IV");
        assert 6 == romanToInt("VI");

    }

    public static int romanToInt(String s) {

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);


        int number = 0;
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (i + 1 < s.length()) {
                if (map.get(cur) >= map.get(s.charAt(i + 1))) {
                    number += map.get(cur);
                } else {
                    number -= map.get(cur);
                }

            } else {
                number += map.get(cur);
            }


        }
        return number;
    }
}





