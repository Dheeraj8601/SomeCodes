import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 20));
        students.add(new Student("Bob", 22));
        students.add(new Student("Charlie", 18));
        students.add(new Student("David", 21));

        // Define a Comparator to sort students by age in ascending order
        Comparator<Student> ageComparator = new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                return Integer.compare(student1.getAge(), student2.getAge());
            }
        };

        // Sort the list of students using the ageComparator
        Collections.sort(students, ageComparator);

        // Print the sorted list
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
