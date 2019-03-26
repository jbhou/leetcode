package leetcode;

public class SolutionMinPathSum64 {


    int min = Integer.MAX_VALUE;


    public static void main(String[] args) {
        int[][] a = new int[][]{
                {5, 0, 1, 1, 2, 1, 0, 1, 3, 6, 3, 0, 7, 3, 3, 3, 1},
                {1, 4, 1, 8, 5, 5, 5, 6, 8, 7, 0, 4, 3, 9, 9, 6, 0},
                {2, 8, 3, 3, 1, 6, 1, 4, 9, 0, 9, 2, 3, 3, 3, 8, 4},
                {3, 5, 1, 9, 3, 0, 8, 3, 4, 3, 4, 6, 9, 6, 8, 9, 9},
                {3, 0, 7, 4, 6, 6, 4, 6, 8, 8, 9, 3, 8, 3, 9, 3, 4},
                {8, 8, 6, 8, 3, 3, 1, 7, 9, 3, 3, 9, 2, 4, 3, 5, 1},
                {7, 1, 0, 4, 7, 8, 4, 6, 4, 2, 1, 3, 7, 8, 3, 5, 4},
                {3, 0, 9, 6, 7, 8, 9, 2, 0, 4, 6, 3, 9, 7, 2, 0, 7},
                {8, 0, 8, 2, 6, 4, 4, 0, 9, 3, 8, 4, 0, 4, 7, 0, 4},
                {3, 7, 4, 5, 9, 4, 9, 7, 9, 8, 7, 4, 0, 4, 2, 0, 4},
                {5, 9, 0, 1, 9, 1, 5, 9, 5, 5, 3, 4, 6, 9, 8, 5, 6},
                {5, 7, 2, 4, 4, 4, 2, 1, 8, 4, 8, 0, 5, 4, 7, 4, 7},
                {9, 5, 8, 6, 4, 4, 3, 9, 8, 1, 1, 8, 7, 7, 3, 6, 9},
                {7, 2, 3, 1, 6, 3, 6, 6, 6, 3, 2, 3, 9, 9, 4, 4, 8}
        };

        System.err.println(new SolutionMinPathSum64().minPathSum(a));

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.err.print(a[i][j] + ",");
            }
            System.err.println();
        }
    }

    public int minPathSum(int[][] grid) {


        if (grid == null || grid.length == 0) {
            return 0;
        }
        int m = grid.length, n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j > 0) {
                    grid[i][j] = grid[i][j - 1] + grid[i][j];
                } else if (i > 0 && j == 0) {
                    grid[i][j] = grid[i - 1][j] + grid[i][j];
                } else if (i > 0 && j > 0) {
                    grid[i][j] = Math.min(grid[i - 1][j], grid[i][j - 1]) + grid[i][j];
                }
            }
        }
        return grid[m - 1][n - 1];


//        dfs(a, 0, 0, 0);
//        return min;
    }


    /**
     * dfs 算法实现
     *
     * @param a
     * @param i
     * @param j
     * @param tmpV
     */
    private void dfs(int[][] a, int i, int j, int tmpV) {


        if (i < 0 || i >= a.length || j < 0 || j >= a[0].length) {
            return;
        }
        tmpV = tmpV + a[i][j];
        if (i == a.length - 1 && j == a[0].length - 1 && min > tmpV) {
            min = tmpV;
        }
        dfs(a, i + 1, j, tmpV);
        dfs(a, i, j + 1, tmpV);

    }


}
