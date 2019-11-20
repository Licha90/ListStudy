package testvector;

import java.util.Vector;

public class TestVector {
    public static void main(String[] args) {

        Vector<String> vector = new Vector<String>();

        for (int i = 0; i <= 20; i++ ){

            vector.add("a");

            System.out.println(vector.size() + "--" + vector.capacity());
        }

//        System.out.println(vector);
//
//        System.out.println(vector.get(0));
//
//        System.out.println(vector.remove(0));
//
//        System.out.println(vector.set(0,"z"));
//
//        System.out.println(vector);

    }
}
