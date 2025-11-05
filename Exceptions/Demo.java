
public class Demo {

    public static void main(String[] args) {

        int i = 0;
        int j = 2;

        int[] arr = new int[5];

        try {
            j = j / i;
            System.out.println(arr[1]);
            System.out.println(arr[5]);
        } catch (ArithmeticException e) {
            System.out.println("Divided by zero : " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds : " + e);
        } catch (Exception e) {         
            System.out.println("Something went wrong : " + e);
        }

        System.out.println("Bye");
    }
}
