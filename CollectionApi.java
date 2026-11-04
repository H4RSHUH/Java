import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
// import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectionApi {
    public static void main(String args[]){
        // List<Integer> nums = new ArrayList<Integer>();

        // nums.add(5);
        // nums.add(4);
        // nums.add(6);
        // nums.add(7);

        // System.out.println(nums.get(2));
        // System.out.println(nums);
        // for(int i : nums)System.out.println(i);


        // Random order
        // Set<Integer> st = new HashSet<>();

        // For always sorted TreeSet is there 
        Set<Integer> st = new TreeSet<>();
        st.add(5);
        st.add(4);
        st.add(3);
        st.add(5 );

        Iterator<Integer> it = st.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(st);

        Map<String, Integer> mp = new HashMap<>();

        mp.put("A", 1);
        mp.put("B", 2);
        mp.put("C", 3);
        System.out.println(mp.get("B"));
        System.out.println(mp.keySet());
        for(String key : mp.keySet()){
            System.out.println(key + " : " + mp.get(key));
        }

    }
}
