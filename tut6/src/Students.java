
import java.util.*;

public class Students {
    private static List<Student> studentList = new ArrayList<>();

    public static void addStudent(Student student) {
        studentList.add(student);
    }

    public static void promoteAllStudents() {
        for (Student student : studentList) {
            student.promoteToNextSemester();
        }
    }

    public static void displayInfoAboutAllStudents() {
        for (Student student : studentList) {
            student.displayInfo();
        }
    }
}
