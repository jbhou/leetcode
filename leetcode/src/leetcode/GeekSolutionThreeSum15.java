package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * ClassName:Soluation3Sum <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年5月26日 下午12:21:51 <br/>
 *
 * @author lenovo
 * @version 1.0.0
 * @see
 */
public class GeekSolutionThreeSum15 {


    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<String> set = new HashSet<>();
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Arrays.binarySearch(nums, j + 1, nums.length, 0 - nums[i] - nums[j]) > 0) {
                    String str = nums[i] + "," + nums[j];
                    if (!set.contains(str)) {
                        set.add(str);
                        list.add(Arrays.asList(nums[i], nums[j], 0 - nums[i] - nums[j]));
                    }
                }
            }
        }
        return list;
    }


    public List<List<Integer>> threeSum2(int[] nums) {


        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i >= 1 && nums[i] == nums[i - 1]) {
                continue;
            }
            Set<Integer> set = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) {
                if (set.contains(nums[j])) {
                    result.add(Arrays.asList(nums[i], -nums[i] - nums[j], nums[j]));
                } else {
                    set.add(-nums[i] - nums[j]);
                }
            }
        }
//        return result;

        return new ArrayList<>(new HashSet<>(result));
    }


    /**
     * 超时 main:(这里用一句话描述这个方法的作用). <br/>
     * TODO(这里描述这个方法适用条件 – 可选).<br/>
     *
     * @param args
     * @author lenovo
     */
    // public List<List<Integer>> threeSum(int[] nums) {
    //
    //
    // Set<String> set = new HashSet<>();
    // int[] sub = new int[3];
    // List<List<Integer>> res = new ArrayList<>();
    // for (int i = 0; i < nums.length; i++) {
    // for (int j = i + 1; j < nums.length; j++) {
    // for (int k = j + 1; k < nums.length; k++) {
    // if (nums[i] + nums[j] + nums[k] == 0) {
    // sub[0] = nums[i];
    // sub[1] = nums[j];
    // sub[2] = nums[k];
    // Arrays.sort(sub);
    // String str = sub[0] + "," + sub[1] + "," + sub[2];
    // if (!set.contains(str)) {
    // List<Integer> list = new ArrayList<>();
    // list.add(nums[i]);
    // list.add(nums[j]);
    // list.add(nums[k]);
    // res.add(list);
    // set.add(str);
    // }
    // }
    // }
    // }
    // }
    // return res;
    // }
    public static void main(String[] args) {
        List<List<Integer>> r = new GeekSolutionThreeSum15().threeSum2(new int[]{0,0,0,0});
        System.err.println(r);
    }
}
