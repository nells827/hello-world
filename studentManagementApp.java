// File: StudentManagementApp.java
/**
 * Main application class - entry point
 * Demonstrates creating objects and using polymorphism
 */
public class StudentManagementApp {
    public static void main(String[] args) {
        System.out.println("======================================");
        System.out.println("   STUDENT MANAGEMENT SYSTEM  (OOP)   ");
        System.out.println("======================================\n");

        // Create some courses
        Course math = new Course("Mathematics", "MATH101");
        Course physics = new Course("Physics", "PHY202");
        Course programming = new Course("OOP Programming", "CS301");

        // Create student objects
        Student s1 = new Student(1001, "Aisha Mwangi", 78, math);
        Student s2 = new Student(1002, "Brian Otieno", 62, physics);
        Student s3 = new Student(1003, "Catherine Wanjiku", 45, programming);
        Student s4 = new Student(1004, "David Kipchoge", 88, math);

        // Store in array (demonstrates polymorphic array)
        Student[] students = {s1, s2, s3, s4};

        // Display all students (polymorphism in action)
        for (Student student : students) {
            student.displayDetails();   // calls overridden method
        }

        System.out.println("======================================");
        System.out.println("         End of Report");
        System.out.println("======================================");
    }
}