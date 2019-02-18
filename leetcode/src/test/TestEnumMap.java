package test;

import java.util.EnumMap;

public class TestEnumMap {


    public static void main(String[] args) {

        EnumMap<Color,String> map= new EnumMap<Color, String>(Color.class);

        map.put(Color.BLUE,"blue");
        map.put(Color.RED,"r");
        System.err.println(map);


    }
}


enum Color{
    RED,BLUE


}
