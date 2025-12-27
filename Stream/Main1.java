
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main1 {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(10000);
        int size = 10_000;

        Random ran = new Random();

        for (int i = 1; i < size; i++) {
            nums.add(ran.nextInt(100));
        }

        // int result = nums.stream()
        //         .filter(n -> n % 2 == 0)
        //         .map(n -> n * 2)
        //         .reduce(0, (c, e) -> c + e);
        // System.out.println(result);
        double seqStart = System.currentTimeMillis();
        int sum1 = nums.stream()
                .filter(n -> {

                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {
                    }
                    return n % 2 == 0;
                })
                .map(n -> n * 2)
                .mapToInt(n -> n)
                .sum();

        System.out.println(sum1);
        double seqEnd = System.currentTimeMillis();
        System.out.println("seq : " + (seqEnd - seqStart));

        double paraStart = System.currentTimeMillis();
        int sum2 = nums.parallelStream()
                .filter(n -> {

                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {
                    }
                    return n % 2 == 0;
                })
                .map(n -> n * 2)
                .mapToInt(n -> n)
                .sum();
        double paraEnd = System.currentTimeMillis();
        System.out.println(sum2);
        System.out.println("para : " + (paraEnd - paraStart));

        // s3.forEach(n -> System.out.println(n));
    }
}
