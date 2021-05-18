package leetcode.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class SolutionSumofkNumber {


    public static void main(String[] args) {
        System.err.println(new SolutionSumofkNumber().sumOfkNumber2(5, 5));
        System.err.println(new SolutionSumofkNumber().sumofkNumber(5, 5));


    }


    /**
     * 输入两个数n 和sum,要求从数列1...n之间选出和为Sum 的多组数,
     *
     * @return
     */

    public List<List<Integer>> sumofkNumber(int n, int m) {

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }


        List<List<Integer>> result = new ArrayList<>();


        recursion(a, 0, m, new ArrayList<>(), result);

        return result;


    }

    private void recursion(int[] a, int startIndex, int m, ArrayList<Integer> tempList, List<List<Integer>> result) {

        if (m == 0) {
            result.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = startIndex; i < a.length; i++) {
            tempList.add(a[i]);
            recursion(a, i + 1, m - a[i], tempList, result);

            tempList.remove((Integer) a[i]);
        }

    }


    static List<List<Integer>> sumOfkNumber2(int n, int sum) {


        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }
        List<List<Integer>> ans = new ArrayList<>();

        calc(a, 0, ans, new ArrayList<Integer>(), 0, sum);

        return ans;
    }

    private static void calc(int[] a, int index, List<List<Integer>> ans, ArrayList<Integer> tmpList, int curSum, int sum) {


        if (curSum == sum) {
            ans.add(new ArrayList<>(tmpList));
            return;
        }

        for (int i = index; i < a.length; i++) {
            tmpList.add(a[i]);
            calc(a, i + 1, ans, tmpList, curSum + a[i], sum);
            tmpList.remove((Integer) a[i]);
        }


    }


}
