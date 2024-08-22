
// import java.util.ArrayList;
// import java.util.List;
// import java.util.Collections;
// import java.util.Comparator;
import java.util.*;

class Student implements Comparable<Student> { // Comparable req compareTo
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    public int compareTo(Student that) {
        return this.age > that.age ? 1 : -1;
    }

}

public class Demo3 {
    public static void main(String[] args) {

        // Comparator is interface by which we can specify our own logic for sorting
        // Comparator<Integer> com = new Comparator<Integer>() {
        //     public int compare(Integer i, Integer j) { // comparing based on last digit
        //         if (i % 10 > j % 10)
        //             return 1;
        //         else
        //             return -1;
        //     }
        // };

        List<Integer> nums = new ArrayList<>();
        nums.add(24);
        nums.add(49);
        nums.add(12);
        nums.add(43);
        // Collections.sort(nums);
        // System.out.println(nums);

        // Collections.sort(nums, com); // user defined sort comparator
        // System.out.println(nums);

        // Comparator<Student> com = (Student o1, Student o2) ->{ //using lambda expression
        // return o1.age>o2.age?1:-1; //sort based on age
        // };

        // Comparator<Student>com = (o1,o2)->o1.age>o2.age?1:-1;    //more shorter using lambda

        List<Student> stud = new ArrayList<>();
        stud.add(new Student(24, "Mohit"));
        stud.add(new Student(18, "Sohit"));
        stud.add(new Student(5, "Kaukau"));
        stud.add(new Student(23, "Pulkit"));

        // System.out.println(stud);
        // Collections.sort(stud, com);
        // for(Student s: stud){
        // System.out.println(s);
        // }

        // Collections.sort(stud); //only works in objects in class when used with
        // comaparable and compareTo
        // for (Student s : stud) {
        // System.out.println(s);
        // }

    }
}
