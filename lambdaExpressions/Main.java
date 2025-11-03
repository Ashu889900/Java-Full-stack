import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(3, 8, 12, 5, 10);

        System.out.println("Original List : ");
        l.forEach(nums -> System.out.println(" " + nums));

        System.out.println("Even numbers : ");
        l.forEach(nums -> {
            if (nums % 2 == 0)
                System.out.println(nums);
        });
    }
}
