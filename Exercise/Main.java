

public class Main {
    public static void main(String[] args) {
        char chars[] = {'a', 'b', 'c', 'd', 'e', 'f'};

        String str = new String(chars, 1, 3);

        System.out.println(str);

        StringBuffer sb = new StringBuffer("Java Code");

        System.out.println(sb.capacity());

        sb.trimToSize();

        System.out.println(sb.capacity());


    }

    
}
