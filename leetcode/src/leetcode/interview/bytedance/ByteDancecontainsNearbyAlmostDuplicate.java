package leetcode.interview.bytedance;


import java.util.Set;
import java.util.TreeSet;

//给定一个整数数组，判断数组中是否有两个不同的索引 i 和 j，
// 使得 nums [i] 和 nums [j] 的差的绝对值最大为 t，并且 i 和 j 之间的差的绝对值最大为 ķ。
//
//        示例 1:
//
//        输入: nums = [1,2,3,1], k = 3, t = 0
//        输出: true
//        示例 2:
//
//        输入: nums = [1,0,1,1], k = 1, t = 2
//        输出: true
//        示例 3:
//
//        输入: nums = [1,5,9,1,5,9], k = 2, t = 3
//        输出: false
public class ByteDancecontainsNearbyAlmostDuplicate {


    public static void main(String[] args) {

        int[] a = new int[]{4, 1, -1, 6, 5};

        new ByteDancecontainsNearbyAlmostDuplicate().containsNearbyAlmostDuplicate(a, 3, 1);


    }

    public boolean containsNearbyAlmostDuplicate2(int[] nums, int k, int t) {

        if (nums == null || nums.length < 2 || k <= 0 || t < 0) return false;

        TreeSet<Long> window = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            Set<Long> sub = window.subSet((long) nums[i] - t, true, (long) nums[i] + t, true);

            if (!sub.isEmpty()) {
                return true;
            }
            if (i >= k) {
                window.remove((long) nums[i - k]);
            }
            window.add((long) nums[i]);
        }
        return false;
    }


    /**
     * 超時
     *
     * @param nums
     * @param k
     * @param t
     * @return
     */
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (nums == null || nums.length == 0) return false;
        if (k <= 0) return false;
        if (t < 0) return false;


        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j <= i + k; j++) {
                if (j >= nums.length) break;
                long delta = (long) nums[j] - (long) nums[i];
                delta = Math.abs(delta);
                if (delta >= 0 && delta <= t) {
                    return true;
                }
            }
        }
        return false;

    }


}
