package leetcode.search;

public class SolutionFirstBadVersion extends VersionControl {


    public static void main(String[] args) {
        int v = new SolutionFirstBadVersion().firstBadVersion(100);
        System.err.println(v);
    }


    public int firstBadVersion(int n) {


        int low = 1;
        int high = n;
        int res = 0;
        while (low <= high) {

            int mid = low + ((high - low) >> 1);

            if (isBadVersion(mid)) {
                if (mid == 1 || !isBadVersion(mid - 1)) {
                    res = mid;
                    break;
                } else {
                    high = mid - 1;
                }
            } else {
                low = mid + 1;
            }

        }
        return res;

    }


}

class VersionControl {


    boolean isBadVersion(int version) {

        if (version >= 3) {
            return true;
        }
        return false;


    }


}