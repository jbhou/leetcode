package leetcode;

import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.List;

public class SolutionCombine77 {


    public static void main(String[] args) {

        System.err.println(new SolutionCombine77().combine(5, 2));


    }

    public List<List<Integer>> combine(int n, int k) {


        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }

        List<List<Integer>> result = new ArrayList<>();

        combineRecursion(a, k, -1, new ArrayList<>(), result);
        return result;

    }


    public void combineRecursion(int[] a, int k, int lastIndex, List<Integer> list, List<List<Integer>> result) {


        if (0 == k) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (Integer i = lastIndex + 1; i < a.length; i++) {
            list.add(a[i]);
            combineRecursion(a, k - 1, i, list, result);
            list.remove((Integer) a[i]);
        }

    }


}
