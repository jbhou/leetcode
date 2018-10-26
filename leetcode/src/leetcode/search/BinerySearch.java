package leetcode.search;

import java.util.Collections;

public class BinerySearch {


    /**
     * 二分搜索  查找效率  O(log n)
     * 使用的条件很多:
     * 1:必须是连续内存，数组，不适用于太大的数据量
     * 2:数组必须有序，适用于一次排序，多次查找的无序数组,排序可以快排 (n*log n).排序的成本可以被分摊
     *
     * @param args
     */

    public static void main(String[] args) {
//        int t = 10000000;
        int t = 10;
        int[] a = new int[t * t];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        long start = System.currentTimeMillis();
        int index = loopBinerySearch(a, 30, 0, a.length - 1);
        System.err.println(index);
        System.err.println("Time:" + (System.currentTimeMillis() - start));
    }


    /**
     * 递归
     *
     * @param a
     * @param x
     * @param start
     * @param end
     * @return
     */

    public static int binerySearch(int[] a, int x, int start, int end) {
        if (start > end) return -1;
        int midIndex = start + ((end - start) >> 1);
        if (a[midIndex] == x) {
            return midIndex;
        }
        if (x > a[midIndex]) {
            return binerySearch(a, x, midIndex + 1, end);
        } else {
            return binerySearch(a, x, start, midIndex - 1);
        }
    }

    /**
     * 非递归，循环
     *
     * @param a
     * @param x
     * @param start
     * @param end
     * @return
     */

    public static int loopBinerySearch(int[] a, int x, int start, int end) {


        int startIndex = start;
        int endIndex = end;


        while (startIndex <= endIndex) {
            int midIndex = startIndex + ((endIndex - startIndex) >> 1);
            if (a[midIndex] == x) {
                return midIndex;
            }
            if (a[midIndex] > x) {
                endIndex = midIndex - 1;
            } else {
                startIndex = midIndex + 1;
            }

        }
        return -1;


    }


}
