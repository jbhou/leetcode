package leetcode;

public class SolutionfindKthLargest215 {

    public static void main(String[] args) {
        System.err.println(new SolutionfindKthLargest215().findKthLargest(new int[]{1, 2, 3, 4, 65, 3, 2, 1, 4, 2, 45}, 3));
    }

    public int findKthLargest(int[] nums, int k) {
        return find(nums, 0, nums.length - 1, k);
    }

    private int find(int[] nums, int left, int right, int k) {
        int p = partition(nums, left, right);
        if (p + 1 == k) return nums[p];
        if (p + 1 > k) {
            return find(nums, left, p - 1, k);
        } else {
            return find(nums, p + 1, right, k);
        }
    }

    private int partition(int[] nums, int left, int right) {
        int pivot = nums[right];
        int i = left, j = left;
        while (j < right) {
            if (nums[j] > pivot) {
                int t = nums[j];
                nums[j] = nums[i];
                nums[i] = t;
                i++;
            }
            j++;
        }
        nums[right] = nums[i];
        nums[i] = pivot;
        return i;
    }
}
