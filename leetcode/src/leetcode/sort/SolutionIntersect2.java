package leetcode.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SolutionIntersect2 {


    public static void main(String[] args) {

        int[] a = new int[]{1, 2, 2, 3, 4, 5};
        int[] b = new int[]{1, 3, 2, 4};
        int[] c = intersect(a, b);

        for (int i = 0; i < c.length; i++) {
            System.err.println(c[i]);
        }

    }

    public static int[] intersect(int[] nums1, int[] nums2) {

        sort(nums1);
        sort(nums2);

        List<Integer> list = new ArrayList<>();
        int j = 0;
        int i = 0;
        while (j < nums1.length && i < nums2.length) {

            if (nums1[j] == nums2[i]) {
                list.add(nums1[j]);
                j++;
                i++;
            } else {
                if (nums1[j] < nums2[i]) {
                    j++;
                } else {
                    i++;
                }
            }


        }

        int[] c = new int[list.size()];

        for (int k = 0; k < c.length; k++) {
            c[k] = list.get(k);
        }
        return c;


    }

    public static void sort(int[] a) {

        for (int i = 0; i < a.length; i++) {
            boolean swap = false;
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int b = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = b;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }


    }


}
