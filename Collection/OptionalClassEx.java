//Optional class
//The Optional class in Java 8 is a container object which is used to contain a value that might or might not be present
//It deals with NullPointerException in Java application..

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClassEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Mohit", "Sohit", "Kau kau", "Pulkit");

        String n = names.stream()
                    .filter(str->str.contains("x"))
                    .findFirst()
                    .orElse("Not Found");
        System.out.println(n);

        //optional class
        Optional<String> name = names.stream()
                    .filter(str->str.contains("o"))
                    .findFirst();
        System.out.println(name.orElse("Not found"));
    }
}
