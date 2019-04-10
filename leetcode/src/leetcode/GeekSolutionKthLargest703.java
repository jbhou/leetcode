package leetcode;

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
