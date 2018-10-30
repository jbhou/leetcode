package leetcode.search;

public class SolutionSearchMatrix2 {


    public static void main(String[] args) {

//        int[][] a = new int[][]{
//                {1, 4, 7, 11, 15},
//                {2, 5, 8, 12, 19},
//                {3, 6, 9, 16, 22},
//                {10, 13, 14, 17, 24},
//                {18, 21, 23, 26, 30}
//        };
        int[][] a = new int[][]{};

        System.err.println(searchMatrix(a, 5));
    }


    public static boolean searchMatrix(int[][] matrix, int target) {

        if (matrix.length == 0) {
            return false;
        }
        int n = matrix.length;
        int m = matrix[0].length;
        if (m == 0) {
            return false;
        }
        for (int i = 0; i < n; i++) {
            int[] a = matrix[i];
            int low = 0;
            int high = m - 1;
            if (a[0] <= target && a[m - 1] >= target) {
                while (low <= high) {
                    int mid = low + ((high - low) >> 1);

                    if (a[mid] == target) {
                        return true;
                    }
                    if (a[mid] < target) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
            }


        }

        return false;
    }

}
