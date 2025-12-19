import java.util.HashSet;
import java.util.Set;

public class Main1 {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        s.add(45);
        s.add(67);
        s.add(13);
        s.add(14);
        s.add(98);

        for (Integer i : s) {
            System.out.println(i * 10);
        }
        
        s.contains(14);
        s.remove(14);
        s.add(10);
        System.out.println(s);
    }    
}
