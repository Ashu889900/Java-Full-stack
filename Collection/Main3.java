import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {

        Comparator<Integer> list = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                if(i%10 > j%10)
                    return 1;
                else 
                    return -1;
            }
        };
        
        List<Integer> nums = new ArrayList<>();
        nums.add(78);
        nums.add(57);
        nums.add(87);
        nums.add(13);

        Collections.sort(nums, list);
        

        System.out.println(nums);

    }
    
}
