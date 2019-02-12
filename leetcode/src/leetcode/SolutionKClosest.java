package leetcode;

import java.util.*;

public class SolutionKClosest {


    public static void main(String[] args) {
        int[][] a = new int[2][2];
        a[0] = new int[]{1, 3};
        a[1] = new int[]{-2, 2};
        new SolutionKClosest().kClosest(a, 1);
    }


    public int[][] kClosest(int[][] points, int K) {


        PriorityQueue<Integer> queue = new PriorityQueue<>(points.length);
        Map<Integer, Integer> map = new HashMap<>(points.length);
        for (int i = 0; i < points.length; i++) {
            int[] a = points[i];
            int distance = a[0] * a[0] + a[1] * a[1];
            queue.add(distance);
            map.put(distance, i);
        }
        int[][] r = new int[K][2];
        for (int i = 0; i < K; i++) {
            r[i] = points[map.get(queue.poll())];
        }
        return r;
    }


}
