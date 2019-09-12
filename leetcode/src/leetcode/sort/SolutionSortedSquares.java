package leetcode.sort;

public class SolutionSortedSquares {

    public static void main(String[] args) {
        int a[] = new int[]{-4, -3, -1, 0, 2, 3, 4, 5};
        int[] r = new SolutionSortedSquares().sortedSquares(a);

        for (int i : r) {
            System.err.print(i + ",");
        }

    }

    public int[] sortedSquares(int[] A) {



        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }


        quickSort(A, 0, A.length - 1);

        return A;


    }

    private void quickSort(int[] a2, int start, int end) {


        if (start >= end) {
            return;
        }

        int i = partition(a2, start, end);
        quickSort(a2, start, i - 1);
        quickSort(a2, i + 1, end);


    }

    private int partition(int[] a2, int start, int end) {

        int pivot = a2[end];
        int i = start, j = start;
        for (; j < end; j++) {
            if (a2[j] < pivot) {
                int t = a2[j];
                a2[j] = a2[i];
                a2[i] = t;
                i++;
            }
        }

        a2[end] = a2[i];
        a2[i] = pivot;
        return i;

    }














































}
