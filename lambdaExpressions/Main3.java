@FunctionalInterface
interface A {
    int sq(int x);
}

public class Main3 {
    public static void main(String[] args) {
        A obj = x -> x * x;

        int result = obj.sq(5);
        System.out.println(result);
    }
}
