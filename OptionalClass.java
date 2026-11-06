import java.util.List;
import java.util.Arrays;
import java.util.Optional;

public class OptionalClass{
    public static void main(String[] args){
        List<String> nums = Arrays.asList("Harsh", "Amna", "Saurabh", "Ankit", "Divyam");

        // It prevents null pointer exception, it is a wrapper class which can contain null or non-null values
        Optional<String> name = nums.stream()
            .filter(n -> n.startsWith("z"))
            .findFirst();

        System.out.println(name.orElse("No name found"));

        // Alternate way to do the same thing

        String name2 = nums.stream()
            .filter(n -> n.startsWith("A"))
            .findFirst()
            .orElse("No name found");
        
        System.out.println(name2);
        
    }
}