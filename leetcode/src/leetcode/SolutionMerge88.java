package leetcode;

public class SolutionMerge88 {

    public static void main(String[] args) {


        int[] a = new int[]{1, 2, 3, 0, 0, 0};
        int[] b = new int[]{2, 5, 6};


        for (int i = 0; i < a.length; i++) {
            System.err.print(a[i] + ",");
        }
        new SolutionMerge88().merge(a, 3, b, 3);
        System.err.println("_----------");
        for (int i = 0; i < a.length; i++) {
            System.err.print(a[i] + ",");
        }


    }


    public void merge(int[] a, int m, int[] b, int n) {


        int i = 0;
        int j = 0;
        int index = 0;

        while (i < m + j && j < n) {

            if (a[i] > b[j]) {
                move(a, i, m - i + index + j - 1);
                a[index] = b[j];
                j++;
            }
            i++;
            index++;
        }
        while (j < n) {
            a[index++] = b[j++];
        }


    }


    public void move(int[] a, int startIndex, int lastIndex) {


        for (int i = lastIndex; i >= startIndex; i--) {
            a[i + 1] = a[i];
        }


    }

}


