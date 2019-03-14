package leetcode;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.List;

public class SolutionFindDiagonalOrder498 {

    public static void main(String[] args) {

        int[] a = new SolutionFindDiagonalOrder498().findDiagonalOrder(createMatrix(2));


        for (int i = 0; i < a.length; i++) {
            System.err.print(a[i] + ",");
        }


    }

    public int[] findDiagonalOrder(int[][] matrix) {


        if (matrix.length == 0) return new int[0];
        int m = matrix.length;      // 待处理的矩阵有M行、N列
        int witdth = matrix[0].length;
        int[] result = new int[m * witdth];  // 用来存放遍历的结果
        int i = 0;
        int j = 0;
        for (int resultIndex = 0; resultIndex < result.length; resultIndex++) {
            result[resultIndex] = matrix[i][j];
            if ((i + j) % 2 == 0) {
                if (j == witdth - 1) { // 元素在最后一列，往下走
                    i++;
                } else if (i == 0) { // 元素在第一行，往右走
                    j++;
                } else { // 其他情况，往右上走
                    i--;
                    j++;
                }
            } else {
                if (i == m - 1) { //元素在最后一行，往右走
                    j++;
                } else if (j == 0) { // //元素在第一列，往下走
                    i++;
                } else { //其他情况，往左下走
                    i++;
                    j--;
                }
            }
        }
        return result;
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

}
