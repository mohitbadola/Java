// Constructor Reference(Reference to a Constructor)
// You can refer a constructor by using the new keyword.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student {
    String name;
    int age;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

}

public class ConstructorRefEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Mohit", "Kau kau", "Sohit", "Pulkit");

        List<Student> students = new ArrayList<>();
        // for (String name : names) {
        // students.add(new Student(name));
        // }

        // students = names.stream()
        // .map(name -> new Student(name))
        // .toList();

        students = names.stream()
                .map(Student::new) // constructor Reference
                .toList();

        System.out.println(students);

    }
}
