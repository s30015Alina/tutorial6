import java.util.*;

public class Student {
    private static int indexCounter = 1;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String phoneNumber;
    private Date birthDate;
    private int indexNumber;
    private String status;
    private StudyProgramme programme;
    private int currentSemester;
    private List<Grade> grades;

    public Student(String firstName, String lastName, String email, String address, String phoneNumber, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.indexNumber = indexCounter++;
        this.status = "Kandydat";
        this.currentSemester = 0;
        this.grades = new ArrayList<>();
    }

    public void enrollStudent(StudyProgramme programme) {
        this.programme = programme;
        this.currentSemester = 1;
        this.status = "Student";
    }

    public void addGrade(int grade, String subject) {
        this.grades.add(new Grade(grade, subject));
    }

    public void promoteToNextSemester() {
        if (this.currentSemester < this.programme.getNumberOfSemesters() && getNumberOfFails() <= this.programme.getAllowedFails()) {
            this.currentSemester++;
            if (this.currentSemester == this.programme.getNumberOfSemesters()) {
                this.status = "Absolwent";
            }
        }
    }

    public int getNumberOfFails() {
        int fails = 0;
        for (Grade grade : grades) {
            if (grade.getGrade() < 3) {
                fails++;
            }
        }
        return fails;
    }

    public void displayInfo() {
        System.out.println("Index: " + indexNumber + ", Name: " + firstName + " " + lastName + ", Email: " + email +
                ", Address: " + address + ", Phone: " + phoneNumber + ", Status: " + status + ", Current Semester: " + currentSemester);
    }

    // Getters and Setters (omitted for brevity)
}

class Grade {
    private int grade;
    private String subject;

    public Grade(int grade, String subject) {
        this.grade = grade;
        this.subject = subject;
    }

    public int getGrade() {
        return grade;
    }

    public String getSubject() {
        return subject;
    }
}
