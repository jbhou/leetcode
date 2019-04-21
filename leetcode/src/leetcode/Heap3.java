package leetcode;

public class Heap3 {


    private int[] a;
    private int count;
    private int size;


    public Heap3(int size) {
        this.size = size;
        a = new int[size + 1];
    }


    public void removeMax() {

        count--;
        a[1] = a[count];
        heapfiy(a, count, 1);
    }

    private void heapfiy(int[] a, int count, int i) {

        while (true) {
            int maxPosition = i;
            if (2 * i < count && a[i] < a[2 * i]) maxPosition = 2 * i;// 如果左子节点比该节点大,
            if (2 * i + 1 < count && a[maxPosition] < a[2 * i + 1]) maxPosition = 2 * i + 1;   // 如果右子节点比左子节点大
            if (i == maxPosition) break;
            swap(a, i, maxPosition);
            i = maxPosition;
        }


    }

    private void swap(int[] a, int i, int maxPosition) {

        int t = a[i];
        a[i] = a[maxPosition];
        a[maxPosition] = t;

    }


}
