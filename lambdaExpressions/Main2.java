@FunctionalInterface
interface A {
    int add(int i, int j);
}

public class Main2 {
    public static void main(String[] args) {
        A obj = (i, j) -> i + j; // automatically return lambda expression

        int result = obj.add(7, 13);

        System.out.println(result);
    }
}
