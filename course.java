// File: Course.java
/**
 * Simple Course class to show composition
 * (Student HAS-A Course)
 */
public class Course {
    private String courseName;
    private String courseCode;

    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }
}