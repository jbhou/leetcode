package leetcode.sort;

public class QSort {


    public static void main(String[] args) {


        int[] a = new int[]{1, 2, 34, 212, 22, 123, 5346, 3, 4, 5, 6};

        new QSort().qsort(a);
        for (int i = 0; i < a.length; i++) {
            System.err.println(a[i]);
        }

    }


    public void qsort(int[] a) {


        if (a == null || a.length == 0) return;


        qsort(a, 0, a.length - 1);


    }

    private void qsort(int[] a, int start, int end) {


        if (start >= end) return;
        int q = partition(a, start, end);

        qsort(a, start, q - 1);
        qsort(a, q + 1, end);


    }

    private int partition(int[] a, int start, int end) {

        int i = start, j = start;
        int pivot = a[end];


        for (; j < end; j++) {
            if (a[j] > pivot) {
                int t = a[j];
                a[j] = a[i];
                a[i] = t;
                i++;
            }
        }

        a[end] = a[i];
        a[i] = pivot;
        return i;

    }


}


