package leetcode.sort;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SolutionIntersection {


    public static void main(String[] args) {

        int[] a = new int[]{4,9,5};
        int[] b = new int[]{9,4,9,8,4};
        int[] c=intersection(a,b);
        for (int i = 0; i < c.length; i++) {
            System.err.print(c[i] + "\t");
        }

    }


    public static int[] intersection(int[] nums1, int[] nums2) {


        sort(nums1);
        sort(nums2);

        List<Integer> r = new ArrayList<>();

        for (int i = 0, j = 0; i < nums1.length && j < nums2.length;) {
            if (nums1[i] == nums2[j]) {
                if (!r.contains(nums1[i])) {
                    r.add(nums1[i]);
                }
                i++;
                j++;
            } else {
                if (nums1[i] < nums2[j]) {
                    i++;
                } else {
                    j++;
                }
            }
        }
        int[] a = new int[r.size()];
        for (int i = 0; i < r.size(); i++) {
            a[i] = r.get(i);
        }
        return a;
    }




    /**
     * 用插入法排序
     *
     * @param a
     */
    public static void sort(int[] a) {


        for (int i = 0; i < a.length; i++) {

            int v = a[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (v < a[j]) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = v;
        }


    }


}
