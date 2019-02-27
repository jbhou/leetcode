package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SolutionIpv4ToBinary32String {


    public static void main(String[] args) {


        switch (1) {
            case 2:
                System.err.println(2);
        }
        System.err.println("end");

//        System.err.println(Integer.toBinaryString(255));

//
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
//        list.add("6");
//
//
        for (String s : list) {

            if (s.equals("4")) {
                list.remove(s);
            }
            System.err.println(list);
//            System.err.println(s);
        }
//        System.err.println(list);


//      String s=   "10.1.8.9";
//
//        System.err.println(toBString(s));

    }


    public static String toBString(String ipv4) {


        String[] s = ipv4.trim().split("\\.");
        String res = "";
        for (int i = 0; i < s.length; i++) {
            int intV = Integer.parseInt(s[i].trim());

            res = res + toB(intV) + ".";
        }

        return res.substring(0, res.lastIndexOf('.'));

    }

    private static String toB(int intV) {
        String r = "";

        int i = intV;
        while (i > 0) {

            r = i % 2 + r;
            i = i / 2;

        }

        if (r.length() < 8) {
            do {
                r = '0' + r;
            } while (r.length() < 8);
        }

        return r;

    }

}
