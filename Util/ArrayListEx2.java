import java.util.ArrayList;

class Student {
    private String name;
    private int rollNo;
    private String department;
    private String studentClass;

    public Student(String name, int rollNo, String department, String studentClass) {
        this.name = name;
        this.rollNo = rollNo;
        this.department = department;
        this.studentClass = studentClass;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getDepartment() {
        return department;
    }

    public String getStudentClass() {
        return studentClass;
    }

    @Override
    public String toString() {
        return "Student [Name=" + name + ", Roll No=" + rollNo + ", Department=" + department + ", Class=" + studentClass + "]";
    }
}

public class ArrayListEx2 {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();

        // Add students to the ArrayList
        studentList.add(new Student("John Doe", 101, "Computer Science", "Class A"));
        studentList.add(new Student("Jane Smith", 102, "Electrical Engineering", "Class B"));
        studentList.add(new Student("Bob Johnson", 103, "Mechanical Engineering", "Class C"));

        // Print the list of students
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
