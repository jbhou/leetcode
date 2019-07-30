package leetcode.search;

public class SolutionSearchRotateArray33 {

    public static void main(String[] args) {


        int[] a = new int[]{4, 5, 6, 7, 8, 9, 10, 11, 1, 2, 3};
        int index = search(a, 1);
        System.err.println(index);
    }


    static int search(int nums[], int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < nums[right]) {
                if (nums[mid] < target && nums[right] >= target) left = mid + 1;
                else right = mid - 1;
            } else {
                if (nums[left] <= target && nums[mid] > target) right = mid - 1;
                else left = mid + 1;
            }
        }
        return -1;
    }

    /**
     * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
     * <p>
     * ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
     * <p>
     * 搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。
     * <p>
     * 你可以假设数组中不存在重复的元素。
     * <p>
     * 你的算法时间复杂度必须是 O(log n) 级别。
     * <p>
     * 示例 1:
     * <p>
     * 输入: nums = [4,5,6,7,0,1,2], target = 0
     * 输出: 4
     * 示例 2:
     * <p>
     * 输入: nums = [4,5,6,7,0,1,2], target = 3
     * 输出: -1
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/search-in-rotated-sorted-array
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请
     * 注明出处。
     */
    static int search2(int[] nums, int target) {

        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = l + ((r - l) >> 1);
            if (nums[mid] == target) return mid;

            if (nums[mid] < nums[r]) {// 右边是上升
                if (nums[mid] < target && nums[r] >= target) l = mid + 1;
                else r = mid - 1;
            } else {    //左边是上升,拐点在右
                if (nums[mid] > target && nums[l] <= target) r = mid - 1;
                else l = mid + 1;
            }
        }
        return -1;
    }
}
