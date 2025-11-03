import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> numsList = Arrays.asList(5, 2, 9, 1, 7);

        System.out.println("Original Numbers : ");
        numsList.forEach(nums -> System.out.println(nums));

        System.out.println("Doubled Numbers : ");
        numsList.forEach(nums -> System.out.println(nums * 2));

        System.out.println("Descending Order : ");
        Collections.sort(numsList, (a, b) -> b - a);
        numsList.forEach(nums -> System.out.println(nums));
    }
}
