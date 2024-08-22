//ArrayList

// import java.util.ArrayList;
// import java.util.Collection;
// import java.util.List;
import java.util.*;

class Demo {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        // System.out.println(nums);

        // for (int n : nums) {
        // System.out.println(n);
        // }


        List<Integer> list = new ArrayList<Integer>();
        list.add(24);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // System.out.println(list.indexOf(4));
        // System.out.println(list.get(3)); //gets element on the given index
        // System.out.println(list); //output - [2, 3, 4, 5, 6]
        // for (int it : list) {
        // System.out.println(it);
        // }
        // Collections.sort(list); //for sorting
        // System.out.println(list);
    }
}