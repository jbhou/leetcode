package leetcode;

public class SolutionFindCircleNum547 {

    private int m;
    private int n;
    private int[] dx = new int[]{1, -1, 0, 0};
    private int[] dy = new int[]{0, 0, 1, -1};


    public int findCircleNum(int[][] M) {
        m = M.length;
        if (m == 0) {
            return 0;
        }
        n = M[0].length;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                if (M[i][j] == 1) {
                    DFSMarking(M, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    private void DFSMarking(int[][] M, int i, int j) {

        if (i < 0 || i >= m || j < 0 || j >= n || M[i][j] == 0) return;
        M[i][j] = 0;
        for (int k = 0; k < dx.length; k++) {
            DFSMarking(M, i + dx[k], j + dy[k]);
        }


    }


}


