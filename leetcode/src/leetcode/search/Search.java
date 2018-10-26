package leetcode.search;

/**
 *
 */
public class Search {

    public static void main(String[] args) {


        testFindFirstEqualsOrGreater();
        testFindFirstEquals();
        testFindLastEquals();
        testFindLastLesser();

    }

    private static void testFindLastLesser() {

        int a[] = new int[]{1, 2, 3, 4, 5, 7, 8};
        int index = findLastLesser(a, 9);
        System.err.println(index);

    }


    /**
     * 找最后一个小于等于指定值的数
     * a:[1,2,3,4,5,6,6]  v:5
     *
     * @param a
     * @param v
     * @return
     */


    private static int findLastLesser(int[] a, int v) {

        int low = 0;
        int high = a.length - 1;
        while (low <= high) {


            int mid = low + ((high - low) >> 1);

            if (a[mid] <= v) {
                if (mid == a.length - 1 || a[mid + 1] > v) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    private static void testFindLastEquals() {

        int[] a = new int[]{1, 2, 3, 4, 5, 6, 6, 6, 6, 7, 8};
        int index = findLastEquals(a, 6);
        System.err.println(index);

    }


    private static void testFindFirstEquals() {


        int[] a = new int[]{1, 2, 3, 4, 5, 6, 6, 6, 6, 7, 8};

        int index = findFirstEquals(a, 6);
        System.err.println(index);


    }

    private static void testFindFirstEqualsOrGreater() {
        int[] a = new int[]{2, 3, 4, 6, 7, 8};
        int index = findFirstEqualsOrGreater(a, 5);
        System.err.println(a[index]);
    }

    /**
     * 找第一个大于等于给定值的数
     * a:[2,3,4,6,7,8] v:5
     * return 6
     */
    public static int findFirstEqualsOrGreater(int[] a, int v) {


        int low = 0;
        int high = a.length - 1;
        while (low <= high) {

            int midIndex = low + ((high - low) >> 1);
            if (a[midIndex] < v) {
                low = midIndex + 1;
            } else {
                if (midIndex == 0 || a[midIndex - 1] < v) return midIndex;
                else
                    high = midIndex - 1;
            }

        }
        return -1;
    }


    /**
     * 找第一个等于给定值的数
     * a:[2,3,3,3,3,4,4,4,4,6,7,8] v:4
     * return 6
     */
    public static int findFirstEquals(int[] a, int v) {


        int low = 0;
        int high = a.length - 1;
        while (low <= high) {

            int mid = low + ((high - low) >> 1);
            if (a[mid] < v) {
                low = mid + 1;
            } else {
                if (a[mid] > v) {
                    high = mid - 1;
                } else {
                    if (mid == 0 || a[mid - 1] < v) {
                        return mid;
                    } else {
                        high = mid - 1;
                    }
                }
            }
        }
        return -1;
    }


    /**
     * 找第一个等于给定值的数
     * a:[2,3,3,3,3,4,4,4,4,6,7,8] v:4
     * return 6
     */
    public static int findLastEquals(int[] a, int v) {


        int low = 0;
        int high = a.length - 1;
        while (low <= high) {

            int mid = low + ((high - low) >> 1);
            if (a[mid] < v) {
                low = mid + 1;
            } else {
                if (a[mid] > v) {
                    high = mid - 1;
                } else {
                    if (mid == a.length - 1 || a[mid + 1] > v) {
                        return mid;
                    } else {
                        low = mid + 1;
                    }
                }
            }
        }
        return -1;
    }


}
