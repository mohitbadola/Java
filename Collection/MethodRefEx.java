
//Method Reference
//Method reference is used to refer method of functional interface. 
//It’s a shorthand notation in Java to refer to a method without actually calling it.

import java.util.Arrays;
import java.util.List;

public class MethodRefEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Mohit", "Kau kau", "Sohit", "Pulkit");

        // List<String> upperName = names.stream()
        // .map(name -> name.toUpperCase())
        // .toList();
        // System.out.println(upperName);
        // upperName.forEach(str->System.out.println(str));

        List<String> upName = names.stream()
                .map(String::toUpperCase) // method reference- String::toUpperCase
                .toList(); // String::toUpperCase refers to the toUpperCase method of the String class.

        upName.forEach(System.out::println);// method reference- System.out::println
        // it refers to the println method of PrintStream(System.out) class
    }
}
