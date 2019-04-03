package test;

public class TestBtrace {

    public static void main(String[] args) {

        TestBtrace t = new TestBtrace();

        int i1 = 0;
        int i2 = 0;
        while (true) {
            i2 = i2 + i1;
            int i = t.trace(i1++, i2);
            System.err.println(i);
        }


    }


    public int trace(int i1, int i2) {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {


        }

        return i1 + i2;

    }


}
