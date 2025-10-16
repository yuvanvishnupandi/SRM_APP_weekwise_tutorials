import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class StudentProfile {

    public static BiConsumer<String, Integer> createStudentProfile(String name) {
        // This map is "closed over" by the lambda below
        Map<String, Integer> marks = new HashMap<>();

        return (subject, mark) -> {
            marks.put(subject, mark);
            double average = marks.values().stream().mapToInt(Integer::intValue).average().orElse(0.0);
            
            System.out.println("Updated marks for " + name + ": " + marks);
            System.out.printf("New average: %.2f\n", average);
        };
    }

    public static void main(String[] args) {
        BiConsumer<String, Integer> student1Marks = createStudentProfile("John");
        
        student1Marks.accept("Math", 90);
        student1Marks.accept("Science", 85);
        student1Marks.accept("History", 88);
    }
}