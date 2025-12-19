
import java.util.HashMap;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("Ashu", 76);
        students.put("kayun", 67);
        students.put("hibiol", 89);
        students.put("Ichikawa", 56);
        students.put("Kentaro", 23);

        System.out.println(students.keySet());
        for (String Key : students.keySet()) {
            System.out.println(Key + " : " + students.get(Key));
        }
        
        for (Map.Entry<String, Integer> en : students.entrySet()) {
            String key = en.getKey();
            Integer val = en.getValue();
            System.out.println(key + " : " + val);

        }
        
        System.out.println(students);
    }
}
