interface A {
    void show(int a);
}

public class Main1 {
    public static void main(String[] args) {
        A obj = a -> System.out.println(a);

        obj.show(5);

    }
}