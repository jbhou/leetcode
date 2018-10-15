package leetcode.sort;

public class SolutionSortColors {


    public static void main(String[] args) {

        int[] a = new int[]{1, 3, 2, 1, 43, 3, 123, 54, 53};

        insertionSort(a);
        for (int i = 0; i < a.length; i++) {
            System.err.print(a[i] + "\t");
        }

    }


    public static void insertionSort(int[] nums) {

        if (nums.length == 1 || nums.length == 0) {
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            int j = i - 1;
            int v = nums[i];

            for (; j >= 0; j--) {
                if (nums[j] > v) {
                    nums[j + 1] = nums[j];
                } else {
                    break;
                }
            }
            nums[j + 1] = v;
        }

    }


}
