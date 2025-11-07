class AshuException extends Exception {
    public AshuException(String str) {
        super(str);
    }
}

public class Main2 {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 18 / i;
            if (j == 0)
                throw new AshuException("I don't want to print zero ");
        }
        catch (ArithmeticException e) {
            j = 18 / i;
            System.out.println("this is deafult output");
        }
        catch (AshuException e) {
            System.out.println("Something went wrong "+e);
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}
