
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StreamApi {
    public static void main(String args[]){
        // List<Integer> nums = java.util.Arrays.asList(4, 5, 6, 8, 9, 2);

        // // It makes you perform operations to nums without making changes to original nums, we can't reuse it, it only once
        // // Stream<Integer> s1 = nums.stream();
        // // Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        // // s2.forEach(n -> System.out.println(n));

        // int result = nums.stream().
        //     filter(n -> n%2 == 0)
        //     .map(n -> n * 2)
        //     .reduce(0, (c, e) -> c + e);


        // nums.forEach(n -> System.out.println(n));

        // System.out.println("Output: " + result);


        // Parallel stream

        List<Integer> nums = new ArrayList<>(10000);

        Random r = new Random();
        for(int i = 0; i < 10000; i++)
                nums.add(r.nextInt(100));
        

        // nums.forEach(n -> System.out.println(n));

        long startTime = System.currentTimeMillis();
        int sum1 = nums.stream()
                    .map(n -> n * 2)
                    .mapToInt(n -> n)
                    .sum();

        long endTime = System.currentTimeMillis();
        
        // paraller stream can be used to make the operations done parallely(By making threads)
        // It will not work with sort because there we need to compare current values with others..
        long startTimeParallel = System.currentTimeMillis();

        int sum2 = nums.parallelStream()
                    .map(n->n * 2)
                    .mapToInt(n -> n)
                    .sum();

        
        long endTimeParallel = System.currentTimeMillis();

        System.out.println(sum1 + " " + sum2);

        System.out.println("Simple : " + (endTime - startTime));
        System.out.println("Parallel : " + (endTimeParallel - startTimeParallel));











    }
}
