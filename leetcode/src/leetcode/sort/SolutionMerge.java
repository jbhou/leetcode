package leetcode.sort;

import java.util.*;

public class SolutionMerge {

    public static void main(String[] args) {

        List<Interval> is = new ArrayList<>();
        is.add(new Interval(1, 5));
        is.add(new Interval(1, 5));

        List<Interval> i2 = merge(is);

        i2.forEach(i -> System.err.println(i));


    }

    public static List<Interval> merge(List<Interval> intervals) {


        if (intervals.size() == 0 || intervals.size() == 1) {
            return intervals;
        }

        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return (o1.start < o2.start) ? -1 : o1.start == o2.start ? 0 : 1;
            }
        });


        List<Interval> result = new ArrayList<>();
        for (int i = 0; i < intervals.size(); ) {
            Interval a = intervals.get(i);
            result.add(a);
            int j = i + 1;
            for (; j < intervals.size(); j++) {
                Interval b = intervals.get(j);
                if (a.end >= b.start) {
                    a.end = Math.max(a.end, b.end);
                } else {
                    break;
                }
            }
            i = j;
        }
        return result;
    }


}

