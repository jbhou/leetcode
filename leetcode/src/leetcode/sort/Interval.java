package leetcode.sort;

public class Interval {

    int start;
    int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public Interval() {

    }

    @Override
    public String toString() {

        return "[" + start + "," + end + "]";
    }
}
