import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        nums.add(4);
        nums.add(6);
        nums.add(8);
        nums.add(1);
        
        // Comparator<Integer> com = new Comparator<Integer>() {
            //     public int compare(Integer a, Integer b){
                //         if(a < b)return 1;
                //         else
                    //             return -1;
                //     }
                // };
            Comparator<Integer> com = (Integer a, Integer b) -> (a < b) ? 1 : -1;
                
            Collections.sort(nums, com);
        System.out.println(nums);
    }
}
