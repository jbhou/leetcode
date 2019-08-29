package leetcode.sort;

public class Sorter {


    public static void bubbleSort(int[] a) {
        boolean swap = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    swap = true;
                    int t = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = t;
                }
            }
            if (!swap) break;
        }
    }


    public static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int j = i - 1;
            int target = a[i];
            for (; j >= 0; j--) {
                if (a[j] > target) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = target;
        }
    }


    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int minValueIndex = i;
            int minV = a[i];
            for (int j = i; j < a.length; j++) {

                if (a[j] < minV) {
                    minValueIndex = j;
                    minV = a[j];
                }
            }
            int t = a[i];
            a[i] = a[minValueIndex];
            a[minValueIndex] = t;
        }
    }


    public void mergeSort(int[] a) {


        if (a.length <= 1) {
            return;
        }








    }


    public static void main(String[] args) {
        int[] a = new int[]{6, 5, 4, 3, 2};

        selectionSort(a);

        for (int i : a) {
            System.err.println(i);
        }

    }


}
