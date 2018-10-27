package leetcode.search;

public class SolutionSearch {


    public static void main(String[] args) {

    }

    public static int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int low = 0;
        int high = nums.length - 1;


        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }


}
