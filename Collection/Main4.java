
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main4 {

    public static void main(String[] args) {

        class Student implements Comparable<Student> {

            String name;
            int age;

            public Student(int age, String name) {
                this.age = age;
                this.name = name;
            }

            @Override
            public String toString() {
                return "Student [name=" + name + ", age=" + age + "]";
            }

            public int compareTo(Student that) {
                return this.age == that.age
                        ? 0
                        : (this.age > that.age ? 1 : -1);
            }

        }

        // Comparator<Student> comp = (i, j) -> i.age > j.age ? 1 : -1;
        List<Student> studs = new ArrayList<>();
        studs.add(new Student(22, "Ashu"));
        studs.add(new Student(21, "Kunal"));
        studs.add(new Student(24, "Piyush"));
        studs.add(new Student(23, "Jospeh"));
        studs.add(new Student(26, "Noah"));

        Collections.sort(studs);
        // Collections.sort(studs, comp);

        for (Student elem : studs) {
            System.out.println(elem);
        }

    }

}
