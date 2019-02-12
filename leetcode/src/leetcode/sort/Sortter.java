package leetcode.sort;

public class Sortter {

    public static void main(String[] args) {

        int a[] = new int[]{8, 9, 1, 7, 2, 3, 5, 4, 6, 0};

//        int[] a= new int[]{1,2,3,4,5,6,7,8};
        //        bubbleSort(a);
//        insertionSort(a);
//        selectionSort(a);
//        shellSort(a);
        quickSort(a, 0, a.length - 1);
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
            int minIndex = i;
            int minValue = a[i];
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


    public static void shellSort(int[] a) {
        if (a.length <= 1) return;
        int len = a.length;
        int step = len / 2;
        while (step >= 1) {


            for (int i = 0; i < len; i++) {
                int j = i - step;
                int v = a[i];
                for (; j >= 0; j -= step) {
                    if (a[j] > v) {
                        a[j + step] = a[j];
                    } else {
                        break;
                    }
                }
                a[j + step] = v;
            }
            step = step / 2;

        }
    }


    public static void quickSort(int[] a, int p, int r) {

        if (p + 1 == 3) {
            System.err.println("第三大的数是:"+a[p]);
        }

        if (p >= r) {
            return;
        }


        int q = partition(a, p, r);
        quickSort(a, p, q - 1);
        quickSort(a, q + 1, r);

    }

    private static int partition(int[] a, int p, int r) {

        int pivot = a[r];
        int i = p;
        int j = p;
        for (; j < r; j++) {
            if (a[j] > pivot) {
                int tmp = a[j];
                a[j] = a[i];
                a[i] = tmp;
                i++;
            }
        }
        int tmp = a[i];
        a[i] = a[r];
        a[r] = tmp;
        System.err.println("i=" + i);
        print(a);
        return i;
    }


    private static void print(int[] a) {
        System.err.print("\t");
        for (int i : a) {
            System.err.print(i + "\t");
        }
        System.err.println();

    }


}
