package leetcode;

public class SolutionAddBinary {


    public static void main(String[] args) {
        String s = new SolutionAddBinary().addBinary("1", "111");

        System.err.println(s);
    }


    public String addBinary(String a, String b) {

        if (a.equals("0")) {
            return b;
        }
        if (b.equals("0")) {
            return a;
        }

        char[] c1 = a.toCharArray();
        char[] c2 = b.toCharArray();

        String s = "";
        int i = c1.length - 1;
        int j = c2.length - 1;
        R r = new R(false, "" + 0);

        while (i >= 0 || j >= 0) {
            char x1 = '0';
            char x2 = '0';
            if (i >= 0) {
                x1 = c1[i--];
            }
            if (j >= 0) {
                x2 = c2[j--];
            }
            r = add(x1, x2, r.flag);
            s = r.r + s;
        }
        if (r.flag) {
            s = 1 + s;
        }
        return s;
    }


    R add(char a, char b, boolean flag) {

        if (a == '0') {
            if (!flag) {
                return new R(false, "" + b);
            } else {
                if (b == '0') {
                    return new R(false, "" + 1);
                } else {
                    return new R(true, "" + 0);
                }
            }
        } else { //a = '1'
            if (!flag) {
                if (b == '0') {
                    return new R(false, "" + 1);
                } else {
                    return new R(true, "" + 0);
                }
            } else {
                if (b == '0') {
                    return new R(true, "" + 0);
                } else {
                    return new R(true, "" + 1);
                }

            }


        }


    }


}


class R {

    boolean flag;
    String r;

    public R(boolean flag, String r) {
        this.flag = flag;
        this.r = r;
    }
}
