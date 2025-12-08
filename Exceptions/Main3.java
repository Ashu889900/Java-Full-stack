class A {
    void show() throws Exception  {
        System.out.println("In Show");
    }
}


public class Main3 {
    public static void main(String[] args) {

        A obj = new A();
        try {
            obj.show();
        } catch (Exception ex) {
        }


    }
}
