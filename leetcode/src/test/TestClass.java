package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass {

    public static void main(String[] args) {


//        System.err.println(new ArrayList().getClass());
//        System.err.println(new ArrayList() {
//        }.getClass());
//
//        Class c1 = new ArrayList() {
//        }.getClass();
//        Class c2 = new ArrayList() {
//        }.getClass();
//        System.err.println(c1 == c2);
        String s2 = "aab";
        String s1 = "aa";
//        System.err.println(s1 == s2);
        System.err.println(s2 == ("aa" + "b"));
//        System.err.println(s2 == s1.concat("b"));

//        Integer[] is = new Integer[]{12, 3, 4, 5, 6,};

//        List<Integer> list = Arrays.asList(is);

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        List subList = list.subList(2, 5);

        System.err.println(list);
        System.err.println(subList);
        subList.set(2, 200);
        System.err.println(list);

        Collections.shuffle(list);
        System.err.println(list);


        List l = new ArrayList() {
            {
                add(1);
                add(2.1);
            }
        };

        System.err.println(l);


        System.err.println(int.class);
    }


    public void m(List<Integer> list) {

    }


}
