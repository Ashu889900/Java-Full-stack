public class Main {
    public static void main(String[] args) {

        int i = 0;
        int j = 20;
        int result;

        try {                   // we are saying to compiler hey try to execute this code 
            result = j / i;
        } catch (Exception e) {  // java throws object we catch with reference obj 
            System.err.println("Something Went Wrong");
        }

        System.out.println(result);
    }
}
