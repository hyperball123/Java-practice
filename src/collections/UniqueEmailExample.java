package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

//Hashset example
public class UniqueEmailExample {
    public static void main(String[] args) {
        Set<String> emails = new HashSet<>();

        emails.add("john@example.com");
        emails.add("alice@example.com");
        emails.add("bob@example.com");
        emails.add("john@example.com"); // Duplicate email, won't be added

        System.out.println("Unique Email Addresses:");
        for (String email : emails) {
            System.out.println(email);
        }
    }
}
