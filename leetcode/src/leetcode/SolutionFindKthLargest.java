package leetcode;

public class SolutionFindKthLargest {


    public static void main(String[] args) {
        int a[] = new int[]{8, 9, 1, 7, 2, 3, 5, 4, 6, 0};
        System.err.println(new SolutionFindKthLargest().findKthLargest(a, 3));
    }


    public int findKthLargest(int[] nums, int k) {
        return find(nums, 0, nums.length - 1, k);
    }

    private int find(int[] nums, int left, int right, int k) {


        int q = partition(nums, left, right);
        if (q + 1 == k) {
            return nums[q];
        }
        if (q + 1 > k) {
            return find(nums, left, q - 1, k);
        } else {
            return find(nums, q + 1, right, k);
        }


    }

    private int partition(int[] nums, int left, int right) {

        int pivot = nums[right];
        int i = left;
        int j = left;


        for (; j < right; j++) {
            if (nums[j] > pivot) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }

        nums[right] = nums[i];
        nums[i] = pivot;

        return i;


    }


}
