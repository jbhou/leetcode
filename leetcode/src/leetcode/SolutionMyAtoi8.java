package leetcode;

public class SolutionMyAtoi8 {


    public static void main(String[] args) {
        System.err.println(new SolutionMyAtoi8().myAtoi("+1"));

    }


    public int myAtoi(String str) {

        str = str.trim();

        if (str == null || str.length() == 0) return 0;


        char c = str.charAt(0);
        if (c != '+' && c != '-' && !Character.isDigit(c)) return 0;


        int result = 0;
        boolean isNegative = str.charAt(0) == '-';
        int i = c == '+' || c == '-' ? 1 : 0;
        for (; i < str.length(); i++) {

            c = str.charAt(i);
            if (!Character.isDigit(c)) {
                return isNegative ? -1 * result : result;
            }

            int l = c - '0';
            if (!isNegative && (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && l > Integer.MAX_VALUE % 10))) {
                return Integer.MAX_VALUE;
            } else if (isNegative && (result > Integer.MAX_VALUE / 10 || result == Integer.MAX_VALUE / 10 && l >= 8)) {
                return Integer.MIN_VALUE;
            } else
                result = result * 10 + l;
        }
        return isNegative ? -1 * result : result;

    }


}
