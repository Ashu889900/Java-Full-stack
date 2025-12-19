
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(78);
        li.add(89);
        li.add(90);
        li.add(21);

        li.add(4, 76);
        li.addFirst(34);
        li.indexOf(76);

        System.out.println(li);

    }
}
