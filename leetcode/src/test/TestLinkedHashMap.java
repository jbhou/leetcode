package test;


import java.util.HashMap;
import java.util.LinkedHashMap;

public class TestLinkedHashMap {

    public static void main(String[] args) {

        HashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        for (int i = 20; i < 30; i++) {
            linkedHashMap.put("" + i, "" + i);
        }

        linkedHashMap.entrySet().stream().forEach(x -> System.err.println(x.getKey() + "=" + x.getValue()));


    }

}
