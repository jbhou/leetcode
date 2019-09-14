package leetcode.interview;

public class SolutionRecursionPackage {


    public static void main(String[] args) {

    }


    int max = Integer.MIN_VALUE;


    public int packageSolution(int[] a, int target) {
        recursion(a, target, 0, 0);
        return max;
    }


    public void recursion(int[] a, int target, int curIndex, int curWeight) {

        if (curIndex == a.length - 1 || target == curIndex) {
            if (curWeight > max) {
                max = curWeight;
                return;
            }
        }


        recursion(a, target, +1, curWeight);// 不装
        if (a[curIndex] + curWeight <= target) {
            recursion(a, target, curIndex + 1, curWeight + a[curIndex]);
        }

    }


    public int dpPackage(int[] a, int weight) {


        boolean[][] state = new boolean[a.length][weight + 1];
        state[0][0] = true;
        if (a[0] < weight) {
            state[0][a[0]] = true;
        }

        for (int i = 1; i < a.length; i++) {


            for (int j = 0; j <= weight; j++) {
                if (state[i - 1][j]) state[i][j] = true;
            }
            for (int j = 0; j <= weight - a[i]; j++) {// 此处的思想是:   除去 该节点的重量,
                if (state[i - 1][j]) {
                    state[i][j + a[i]] = true;
                }
            }
        }
        for (int i = weight; i >= 0; i--) {
            if (state[a.length - 1][weight]) return i;
        }

        return 0;
    }


    //    weight: 物品重量，n: 物品个数，w: 背包可承载重量
    public int knapsack(int[] weight, int n, int w) {
        boolean[][] states = new boolean[n][w + 1]; // 默认值 false
        states[0][0] = true;  // 第一行的数据要特殊处理，可以利用哨兵优化
        if (weight[0] <= w) {
            states[0][weight[0]] = true;
        }
        int total = 0;
        for (int i = 1; i < n; ++i) { // 动态规划状态转移
            for (int j = 0; j <= w; ++j) {// 不把第 i 个物品放入背包
                if (states[i - 1][j] == true) states[i][j] = states[i - 1][j];
            }
            for (int j = 0; j <= w - weight[i]; ++j) {// 把第 i 个物品放入背包
                if (states[i - 1][j] == true) states[i][j + weight[i]] = true;
            }
        }
        for (int i = w; i >= 0; --i) { // 输出结果
            if (states[n - 1][i] == true) return i;
        }
        return 0;
    }


//
//
//    // 回溯算法实现。注意：我把输入的变量都定义成了成员变量。
//    private int maxW = Integer.MIN_VALUE; // 结果放到 maxW 中
//    private int[] weight = {2, 2, 4, 6, 3};  // 物品重量
//    private int n = 5; // 物品个数
//    private int w = 9; // 背包承受的最大重量
//
//    public void f(int i, int cw) { // 调用 f(0, 0)
//        if (cw == w || i == n) { // cw==w 表示装满了，i==n 表示物品都考察完了
//            if (cw > maxW) maxW = cw;
//            return;
//        }
//        f(i + 1, cw); // 选择不装第 i 个物品
//        if (cw + weight[i] <= w) {
//            f(i + 1, cw + weight[i]); // 选择装第 i 个物品
//        }
//    }
}