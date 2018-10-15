package leetcode.sort;

public class Sortter {

    public static void main(String[] args) {

        int a[] = new int[]{1, 4, 2, 1, 56, 64, 22, 76, 53};
//        bubbleSort(a);
//        insertionSort(a);
        selectionSort(a);
        for (int i = 0; i < a.length; i++) {
            System.err.print(a[i] + "\t");
        }

    }


    /**
     * 冒泡排序 时间复杂度O(n^2)
     * 两两比较，把最大的顶上去
     *
     * @param a
     */
    public static void bubbleSort(int[] a) {


        if (a.length <= 1) {
            return;
        }
        for (int i = 0; i < a.length; i++) {
            boolean exchange = false;
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int swap = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = swap;
                    exchange = true;
                }
            }
            if (!exchange) break;
        }
    }

    /**
     * 插入排序，时间复杂度O(n^2)
     * 思想：把未排序部分的第一个，插入到前面已经排好序的该放入的位置
     *
     * @param a
     */

    public static void insertionSort(int[] a) {
        if (a.length <= 1) {
            return;
        }

        for (int i = 0; i < a.length; i++) {
            int v = a[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (a[j] > v) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = v;
        }
    }


    /**
     * 选择法排序，时间复杂度O(N^2)
     * 思想： 从未排序部分选出最小的值，与当前位置的值交换
     *
     * @param a
     */
    public static void selectionSort(int[] a) {

        if (a.length <= 1) return;
        for (int i = 0; i < a.length; i++) {
            int minIndex = a[i];
            int minValue = Integer.MAX_VALUE;
            for (int j = i; j < a.length; j++) {
                if (minValue > a[j]) {
                    minValue = a[j];
                    minIndex = j;
                }
            }
            a[minIndex] = a[i];
            a[i] = minValue;
        }
    }
}
