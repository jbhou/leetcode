package leetcode;

import java.util.*;

public class GeekSolutionTwoSum1 {


    public static void main(String[] args) {
        new GeekSolutionTwoSum1().twoSum(new int[]{3,3}, 6);
    }

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, List<Integer>> map = new HashMap<>();
        int i = 0;
        for (int a : nums) {
            if (!map.containsKey(a)) {
                map.put(a, new ArrayList<>());
            }
            map.get(a).add(i);
            i++;
        }

        for (int k = 0; k < nums.length; k++) {
            int a = nums[k];
            List<Integer> indexes = map.get(a);
            if (indexes.size() == 1) {
                map.remove(a);
            } else {
                indexes.remove(0);
            }
            if (map.containsKey(target - a)) {
                return new int[]{k, map.get(target - a).get(0)};
            }
        }
        return new int[]{};

    }


}
