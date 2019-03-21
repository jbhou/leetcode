package leetcode;

public class SolutionHammingWeight191 {


//    编写一个函数，输入是一个无符号整数，返回其二进制表达式中数字位数为 ‘1’ 的个数（也被称为汉明重量）。


    public static void main(String[] args) {


        System.err.println(new SolutionHammingWeight191().hammingWeight(Integer.MIN_VALUE));


    }

    public int hammingWeight(int n) {


        int x = n;
        int count = 0;
        while (x > 0) {
            count++;
            x = x & (x - 1);
        }
        return count;


    }
}




