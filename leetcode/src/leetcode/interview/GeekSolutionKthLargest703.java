package leetcode.interview;

import java.util.PriorityQueue;

public class GeekSolutionKthLargest703 {

    public static void main(String[] args) {


        KthLargest largest = new KthLargest(3, new int[]{4, 5, 8, 2});

        System.err.println(largest.add(3));
        System.err.println(largest.add(5));
        System.err.println(largest.add(10));
        System.err.println(largest.add(9));
        System.err.println(largest.add(4));

    }

    /**
     * 设计一个找到数据流中第K大元素的类（class）。注意是排序后的第K大元素，不是第K个不同的元素。
     *
     * 你的 KthLargest 类需要一个同时接收整数 k 和整数数组nums 的构造器，它包含数据流中的初始元素。每次调用 KthLargest.add，返回当前数据流中第K大的元素。
     *
     * 示例:
     *
     * int k = 3;
     * int[] arr = [4,5,8,2];
     * KthLargest kthLargest = new KthLargest(3, arr);
     * kthLargest.add(3);   // returns 4
     * kthLargest.add(5);   // returns 5
     * kthLargest.add(10);  // returns 5
     * kthLargest.add(9);   // returns 8
     * kthLargest.add(4);   // returns 8
     * 说明:
     * 你可以假设 nums 的长度≥ k-1 且k ≥ 1。
     */

    static class KthLargest {

        private int k;
        private PriorityQueue<Integer> queue ;

        public KthLargest(int k, int[] nums) {
            this.k = k;
            queue=new PriorityQueue<>(k);

            for (int a : nums) {
                add(a);
            }


        }

        public int add(int val) {

            if (k > queue.size()) {
                queue.offer(val);
            } else if (val > queue.peek()) {
                queue.poll();
                queue.offer(val);
            }
            return queue.peek();

        }

    }
}
