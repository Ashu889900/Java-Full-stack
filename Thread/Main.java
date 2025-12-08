
import java.lang.ref.Cleaner;


class A extends Thread{
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello");
                  try {   
            Thread.sleep(35);
        } catch (InterruptedException ex) {
        }
         
        }
    }
}

class B extends Thread {
   public void run() {
       for (int i = 0; i < 100; i++) {
           System.out.println("Hii");
                  try {   
            Thread.sleep(20);
        } catch (InterruptedException ex) {
        }
       }
    } 
}

public class Main {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj2.setPriority(10);
        obj1.setPriority(1);

        obj1.start();
        obj2.start();
    }
}   
