package leetcode;

import java.io.*;

public class TestByteArrayOutputStream {

    static class Person implements Serializable{
        String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        int id;

        public Person() {
        }

        public Person(String name, int id) {
            this.name = name;
            this.id = id;
        }
    }


    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(bout);

        Person person = new Person();
        person.setId(1);
        person.setName("hjb");

        out.writeObject(person);

        byte[] bs = bout.toByteArray();

        ByteArrayInputStream bin = new ByteArrayInputStream(bs);

        ObjectInputStream obin = new ObjectInputStream(bin);
        Object obj = obin.readObject();
        System.err.println(obj);

    }


}
