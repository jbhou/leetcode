package leetcode;

public class SolutionUniquePathsWithObstacles63 {


    public int uniquePathsWithObstacles(int[][] o) {

        int m = o.length;
        int n = o[0].length;

        int[][] a = new int[m][n];

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {

                if (o[i][j] != 1) {

                    if (i == m - 1 || j == n - 1) {
                        a[i][j] = i == m - 1 ?
                                (j == n - 1 ? 1 : o[i][j + 1] != 1 ? a[i][j + 1] : 0 )
                                : i == m - 1 ? 1 : o[i + 1][j] != 1 ? a[i + 1][j] : 0;
                    } else {
                        a[i][j] = a[i + 1][j] + a[i][j + 1];
                    }
                }
            }
        }
        return a[0][0];

    }


}
