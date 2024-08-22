//Parallel Stream
/* Utilize the multiple cores of the computer. Operates multiple iterations simultaneously in different available cores.
 * The performance is high.
 * Doesn’t care about the order,
 * Less reliable and error-prone.
 * Platform dependent
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class ParallelStreamEx {
    public static void main(String[] args) {
        int size = 10000;
        List<Integer> nums = new ArrayList<>(10000);
        Random ran = new Random();
        for (int i = 1; i <= size; i++) {
            nums.add(ran.nextInt(100));
        }

        long startSeq = System.currentTimeMillis();

        int sum1 = nums.stream()
        .map(n -> {
            try {
                Thread.sleep(1);
            } catch (Exception e) {
            }
            return n * 2;
        })
                .mapToInt(n -> n)
                .sum();

        long endSeq = System.currentTimeMillis();

        long startPara = System.currentTimeMillis();

        int sum2 = nums.parallelStream()
                .map(n -> {
                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {
                    }
                    return n * 2;
                })
                .mapToInt(n -> n)
                .sum();
        
                long endPara = System.currentTimeMillis();

        System.out.println( sum1 + " " + sum2);

        System.out.println("Seq= "+(endSeq-startSeq));
        System.out.println("Seq= "+(endPara-startPara));
    }
}
