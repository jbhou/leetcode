package leetcode;

public class SolutionRotate189 {


    public static void main(String[] args) {


        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7};

        print(a);

        new SolutionRotate189().rotate(a, 3);
        print(a);
    }

    private static void print(int[] a) {


        for (int i : a) {
            System.err.print(i + ",");
        }
        System.err.println();
    }


    public void rotate(int[] nums, int k) {


        k = k % nums.length;
        if (k == 0) {
            return;
        }


        swap(nums, nums.length - k, nums.length - 1);
        swap(nums, 0, nums.length - k - 1);
        swap(nums, 0, nums.length - 1);


    }


    public void swap(int[] a, int startIndex, int endIndex) {


        for (int i = startIndex, j = endIndex; i < j; i++, j--) {


            int tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;


        }


    }


}
