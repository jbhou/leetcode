package leetcode.search;

public class SolutionSearchMatrix {


    public static void main(String[] args) {

        int[][] a = new int[0][0];
        System.err.println(searchMatrix(a, 3));

    }


    public static boolean searchMatrix(int[][] matrix, int target) {

        if (matrix.length == 0) {
            return false;
        }
        for (int i = 0; i < matrix.length; i++) {
            int length = matrix[i].length;
            if (length == 0) {
                return false;
            }
            if (matrix[i][0] <= target && target <= matrix[i][length - 1]) {
                return binarySearch(matrix[i], target);
            }
        }
        return false;
    }


    public static boolean binarySearch(int[] a, int target) {
        if (a.length == 0) {
            return false;
        }

        int low = 0;
        int high = a.length - 1;
        while (low <= high) {

            int mid = low + ((high - low) >>> 1);
            if (a[mid] == target) {
                return true;
            }
            if (a[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }


        }
        return false;

    }
}
