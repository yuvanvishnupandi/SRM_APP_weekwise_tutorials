import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Student {
    String name;
    double cgpa;

    public Student(String name, double cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", cgpa=" + cgpa + '}';
    }
}

public class StudentFilter {

    public static List<Student> filterStudents(Predicate<Student> criteria, List<Student> students) {
        return students.stream()
                       .filter(criteria)
                       .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(List.of(
            new Student("Alice", 8.5),
            new Student("Bob", 7.9),
            new Student("Charlie", 9.1),
            new Student("David", 7.5),
            new Student("Eve", 8.8)
        ));

        // Use a lambda to define the filtering criteria and demonstrate its use [cite: 4, 5]
        List<Student> highCgpaStudents = filterStudents(s -> s.getCgpa() > 8, students);
        System.out.println(highCgpaStudents);
    }
}