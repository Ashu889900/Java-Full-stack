class A {
    public void show() {
        System.out.println("in A show");
    }
}

class B extends A{
    @Override               //you can say way to talk to compiler //meta data// bieng cautious 
    public void show() {
        System.out.println("in B show");
    }
}

public class Main {
    
}
