package collections;

import java.util.Vector;

public class e2_Vector {
    public static void main(String[] args) {
        Vector<Integer> vector =  new Vector<>();

        vector.add(10);
        vector.add(20);
        vector.add(30);

        System.out.println("Elements in Vector:");
        for (int element : vector) {
            System.out.println(element);
        }
    }
}
