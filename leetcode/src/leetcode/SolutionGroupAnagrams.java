package leetcode;

import java.util.*;

public class SolutionGroupAnagrams {


    public static void main(String[] args) {


    }

    /**
     * 不熟最优解.
     * 最优解:把每个字符串 根据每一位的字符取hash
     *
     * @param strs
     * @return
     */
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();
        if (strs == null || strs.length == 0) {
            return result;
        }


        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {

            char[] chars = s.toCharArray();

            Arrays.sort(chars);
            String s1 = new String(chars);
            if (!map.containsKey(s1)) {
                map.put(s1, new ArrayList<>());
            }
            map.get(s1).add(s);
        }
        return new ArrayList<>(map.values());
    }









}
