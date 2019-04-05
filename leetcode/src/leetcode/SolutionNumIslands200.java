package leetcode;

public class SolutionNumIslands200 {


    private int m;
    private int n;

    private int[] dx = new int[]{1, -1, 0, 0};
    private int[] dy = new int[]{0, 0, 1, -1};

    public int numIslands(char[][] grid) {

        m = grid.length;
        if (m == 0) return 0;
        n = grid[0].length;
        int count = 0;


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {

                    DFSMark(grid, i, j);
                    count++;    if (m == 0) return 0;    if (m == 0) return 0;
                }


            }

        }
        return count;

    }

    private void DFSMark(char[][] grid, int i, int j) {

        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == '0') return;

        if (grid[i][j] == '1') grid[i][j] = '0';

        for (int k = 0; k < dx.length; k++) {
            DFSMark(grid, i + dx[k], j + dy[k]);
        }

    }


}
