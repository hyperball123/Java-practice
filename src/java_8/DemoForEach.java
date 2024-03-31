package java_8;

import java.util.Arrays;
import java.util.List;

public class DemoForEach {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(2,3,4,5,6,3);

//        internal loop
//        values.forEach(i -> System.out.println(i));
        values.forEach(System.out::println);

//        -> this expression is known as lamda expression

    }
}
