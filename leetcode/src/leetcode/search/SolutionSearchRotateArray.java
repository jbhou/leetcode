package leetcode.search;

public class SolutionSearchRotateArray {

    public static void main(String[] args) {


        int[] a = new int[]{4, 5, 6, 7, 8, 9, 10,  11, 1, 2, 3};
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
}
