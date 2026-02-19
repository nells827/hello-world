import java.util.Scanner;

class Person {
    String name;

    Person(String n) {
        name = n;
    }

    void show() {
        // to be override
    }
}

class Student extends Person {
    int id;
    int marks;
    String course;

    Student(int i, String n, int m, String c) {
        super(n);
        id = i;
        marks = m;
        course = c;
    }

    String findGrade() {
        if (marks >= 70) {
            return "A";
        }
        else if (marks >= 60) {
            return "B";
        }
        else if (marks >= 50) {
            return "C";
        }
        else if (marks >= 40) {
            return "D";
        }
        else {
            return "F";
        }
    }

    void show() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + findGrade());
        System.out.println("-------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Student Management System");
        System.out.println("=========================");

        // first student
        System.out.print("Enter ID: ");
        int id1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        String name1 = sc.nextLine();
        System.out.print("Enter course: ");
        String course1 = sc.nextLine();
        System.out.print("Enter marks: ");
        int marks1 = sc.nextInt();

        Student s1 = new Student(id1, name1, marks1, course1);

        // second student
        System.out.print("\nEnter ID: ");
        int id2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        String name2 = sc.nextLine();
        System.out.print("Enter course: ");
        String course2 = sc.nextLine();
        System.out.print("Enter marks: ");
        int marks2 = sc.nextInt();

        Student s2 = new Student(id2, name2, marks2, course2);

        System.out.println("\nStudent Details:");
        s1.show();
        s2.show();

        sc.close();
    }
}