package collections;

import java.util.LinkedList;

public class e1_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Alice");
        linkedList.add("Bob");
        linkedList.add("charlie");

        System.out.println("Elements in linkedlist");

        for(String ele : linkedList) {
            System.out.println(ele);
        }
    }
}
