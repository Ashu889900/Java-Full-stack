
import java.util.Arrays;
import java.util.List;

class Main {

    public static void main(String[] args) {
        List<String> name = Arrays.asList("Ashu", "Neo", "Alpha", "Beta");

        String user = name.stream()
                .filter(str -> str.contains("p"))
                .findFirst()
                .orElse("Not Found");

        System.out.println(user);

    }
}
