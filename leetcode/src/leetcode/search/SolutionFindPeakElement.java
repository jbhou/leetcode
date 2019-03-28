package leetcode.search;

public class SolutionFindPeakElement {


    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 2, 1, 3, 6, 5};

        System.err.println(findPeakElement(a));
    }

    public static int findPeakElement(int[] a) {

        int left = 0, right = a.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (a[mid] < a[mid + 1]) left = mid + 1;
            else right = mid;
        }
        return left;
    }
}


