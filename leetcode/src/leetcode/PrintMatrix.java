package leetcode;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;

/**
 * 从右上角开始打印矩阵
 */
public class PrintMatrix {


    public static void main(String[] args) {

        int[][] a = createMatrix(4);

        System.err.println(new PrintMatrix().print(a));


    }

    private static int[][] createMatrix(int n) {
        int[][] a = new int[n][n];
        int k = 1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = k++;
            }

        }
        return a;


    }

    public List<List<Integer>> print(int[][] a) {


        List<List<Integer>> result = new ArrayList<>();


        int c = -(a.length - 1);

        //i-j = c   i=c+j   j =i - c


        while (c < a.length) {

            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < a.length; i++) {
                int j = i - c;
                if (j < 0 || j >= a.length) {
                    continue;
                }
                list.add(a[i][j]);
            }
            c++;
            result.add(list);
        }
        return result;


    }


}
