import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ashu", "Keyun", "Yaner", "Yinfa");

        List<String> Unames = names.stream()
                //.map(n -> n.toUpperCase())
                .map(String::toUpperCase)   //Method reference - By mentioning the class name which method belongs to :: method_name
                .toList();
        //System.out.println(Unames);
        Unames.forEach(System.out::println);
    }
}
