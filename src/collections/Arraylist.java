package collections;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        String fruit = list.get(0);
        System.out.println(fruit);

        list.remove(1);
        System.out.println(list);

        for (String item : list){
            System.out.println(item);
        }

        int size = list.size();
        System.out.println("Size of ArrayList: " + size);
    }
}
