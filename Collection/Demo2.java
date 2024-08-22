//Map

import java.util.HashMap;
import java.util.Map;

public class Demo2 {
    public static void main(String[] args) {
        Map<String, Integer> Students = new HashMap<>();
        Students.put("Mohit", 50);
        Students.put("Sohit", 49);
        Students.put("Kaukau", 48);
        // System.out.println(Students); //op- {Mohit=50, Sohit=49, Kaukau=48}

        // System.out.println(Students.get("Kaukau")); //prints value of the key

        // System.out.println(Students.keySet()); //print all keys

        // System.out.println(Students.values()); //print all values

        // for(String key : Students.keySet()){
        // System.out.println(key +" : "+Students.get(key));
        // }
    }
}
