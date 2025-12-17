
import java.util.ArrayList;
import java.util.List;


public class Demo {
    public static void main(String[] args) {
        List<Integer> nums = new  ArrayList<>();
        nums.add(3);
        nums.add(5);
        nums.add(16);
        nums.add(87);
       

        for (int n : nums) {
            System.out.println(n*41);
        }
        
    }
}
