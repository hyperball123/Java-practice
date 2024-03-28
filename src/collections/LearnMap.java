package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//Map DS
public class LearnMap {
    public static void main(String[] args) {
//        Map<String , Integer> numbers = new HashMap<>();
        Map<String , Integer> numbers = new TreeMap<>();

        numbers.put("One",1);
        numbers.put("Two",2);
        numbers.put("Three",3);
        numbers.put("four",4);
        numbers.put("five",5);

        System.out.println(numbers);

        for(Map.Entry<String,Integer> e: numbers.entrySet()){
            System.out.println(e);

        }
    }
}
