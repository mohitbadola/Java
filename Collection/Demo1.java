//Set

// import java.util.Set;
// import java.util.HashSet;
// import java.util.TreeSet;
// import java.util.Iterator;
import java.util.*;

class Demo1 {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<Integer>(); // unordered Set
        nums.add(46);
        nums.add(4);
        nums.add(5);
        nums.add(8);
        nums.add(6);
        nums.add(45);
        System.out.println(nums); // op- [4, 5, 6, 8]

        for (int it : nums) {
            System.out.println(it);
        }

        Set<Integer> orderedNums = new TreeSet<Integer>(); // Ordered Set
        orderedNums.add(45);
        orderedNums.add(5);
        orderedNums.add(8);
        orderedNums.add(6);
        orderedNums.add(5);

        System.out.println(orderedNums);

        Iterator<Integer> values = orderedNums.iterator(); // iterator method to iterate all values
        while (values.hasNext()) {
            System.out.println(values.next());
        }
    }
}