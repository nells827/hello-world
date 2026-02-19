// File: Student.java
/**
 * Student class that inherits from Person (INHERITANCE)
 * Demonstrates ENCAPSULATION, method overriding (POLYMORPHISM)
 */
public class Student extends Person {
    private final int studentId;      // immutable ID
    private int marks;
    private Course enrolledCourse;    // Composition

    /**
     * Constructor
     * @param studentId unique student identifier
     * @param name student's full name
     * @param marks marks out of 100
     * @param course the course the student is enrolled in
     */
    public Student(int studentId, String name, int marks, Course course) {
        super(name);
        this.studentId = studentId;
        setMarks(marks);           // using setter for validation
        this.enrolledCourse = course;
    }

    // Encapsulation: controlled access to marks
    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Warning: Invalid marks! Setting to 0.");
            this.marks = 0;
        }
    }

    public int getMarks() {
        return marks;
    }

    public int getStudentId() {
        return studentId;
    }

    public Course getEnrolledCourse() {
        return enrolledCourse;
    }

    // Business logic: grade calculation
    public String getGrade() {
        if (marks >= 70) return "A";
        if (marks >= 60) return "B";
        if (marks >= 50) return "C";
        if (marks >= 40) return "D";
        return "F";
    }

    // POLYMORPHISM: overriding abstract method from Person
    @Override
    public void displayDetails() {
        System.out.println("┌──────────────────────────────────────┐");
        System.out.println("  Student ID       : " + studentId);
        System.out.println("  Name             : " + getName());
        System.out.println("  Course           : " + enrolledCourse.getCourseName());
        System.out.println("  Marks            : " + marks + "/100");
        System.out.println("  Grade            : " + getGrade());
        System.out.println("└──────────────────────────────────────┘");
        System.out.println();
    }
}