package test;

import java.util.TreeMap;

public class TestTreeMap {


    public static void main(String[] args) {

        TreeMap<Stu, String> treeMap = new TreeMap<>();


        treeMap.put(new Stu("1"),"");
        treeMap.put(new Stu("2"),"");
        treeMap.put(new Stu("3"),"");
        treeMap.put(new Stu("33"),"");
        treeMap.put(new Stu("44444"),"");
        treeMap.put(new Stu("11111"),"");
        treeMap.put(new Stu("123"),"");
        treeMap.put(new Stu("1233"),"");
        treeMap.put(new Stu("234"),"");
        treeMap.put(new Stu("443"),"");
        treeMap.put(new Stu("6634"),"");



        treeMap.entrySet().stream().forEach(x -> System.err.println(x.getKey() + "=" + x.getValue()));

    }


    static class Stu implements Comparable{
        String name;


        public Stu(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Stu{" +
                    "name='" + name + '\'' +
                    '}';
        }

        @Override
        public int compareTo(Object o) {

            return name.compareTo(((Stu)o).name);
        }
    }
}
