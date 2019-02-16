package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SolutionCombine {


    public static void main(String[] args) {
        System.err.println(new SolutionCombine().combine(4, 2));

    }

    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> re
                = new ArrayList<>();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }
        perm(re, a, n, k);
        return re;
    }

    public void perm(List<List<Integer>> result, int[] a, int start, int end) {


        if (start == end) {
            List<Integer> l = new ArrayList<>();
            for (int i = 0; i < end; i++) {
                l.add(a[i]);
            }
            result.add(l);
        } else {
            for (int i = start; i < end; i++) {
                swap(a, start, i);
                perm(result, a, start + 1, end);
                swap(a, i, start);
            }

        }


    }

    private void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];

        a[j] = t;
    }
}