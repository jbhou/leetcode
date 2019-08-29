package leetcode.sort;

public class Sorter{

    public static void mergeSort(int[]a){

        if(a.length<=1){
            return;
        }


        mergeSortInternal(a,0,a.length-1);









    }

    private static void mergeSortInternal(int[] a, int i, int n) {

        int mid = i+((n-i)>>1);
        mergeSortInternal(a,i,mid);
    mergeSortInternal(a,mid+1,n);






    }



}
