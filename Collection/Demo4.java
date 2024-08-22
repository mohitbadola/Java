
//Stream API -Stream API is used to process collections of objects.
import java.util.List;
//import java.util.stream.Stream;
import java.util.Arrays;
// import java.util.function.Consumer;

//import java.util.*;
public class Demo4 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

        // for (int n : nums) {
        // System.out.println(n);
        // }
        // for (int i = 0; i < nums.size(); i++) {
        // System.out.println(nums.get(i));
        // }

        // working of for each method
        // Consumer<Integer> con = new Consumer<Integer>(){ //interface
        // public void accept(Integer n) { //anonymous class
        // System.out.println(n); //method name- accept
        // }
        // };

        // nums.forEach(con);

        // forEach method
        // nums.forEach(n -> System.out.println(n)); //its just like lambda expression
        // of above implementation

        // int sum = 0;
        // for(int n : nums){
        // if(n%2==0){
        // n*=2;
        // sum+=n;
        // }
        // }
        // System.out.println(sum);

        // Stream<Integer> s1 = nums.stream(); // Stream can be used only 1 time after
        // that it throws runtime exception
        // // s1.forEach(n->System.out.println(n));
        // Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        // // s2.forEach(n->System.out.println(n)); //op- 4, 2, 6
        // Stream<Integer> s3 = s2.map(n -> n * 2);
        // // s3.forEach(n->System.out.println(n)); //op- 8, 4, 12
        // int res = s3.reduce(0, (c, e) -> c + e);
        // System.out.println(res); // op- 24

        // Efficient way to write
        int result = nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, (c, e) -> c + e);// Here 0-initial value, c-carry, e-current element, c+e-operation
        System.out.println(result); // op- 24

        // List<Integer> arr = Arrays.asList(4,2,15,9);
        // Stream<Integer>SortedValues = arr.stream().filter(n->n%2==0).sorted();  //OP- 2, 4
        // SortedValues.forEach(n->System.out.println(n));

        // List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
        // String resu = letters.stream()
        //         .reduce("", (partialString, element) -> partialString + element);
        // System.out.println(resu); // op- abcde

        // List<Integer> num = Arrays.asList(1, 2, 3, 4);
        // int res = num.stream().reduce(0, (c, e) -> c + e);
        // System.out.println(res); // op- 10


    }
}
