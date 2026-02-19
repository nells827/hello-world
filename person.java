// File: Person.java
/**
 * Abstract base class demonstrating ABSTRACTION
 * All persons share common attributes like name
 * but the way details are displayed is left to subclasses.
 */
public abstract class Person {
    private String name;   // Encapsulation: private field

    // Constructor
    public Person(String name) {
        this.name = name;
    }

    // Encapsulation: getter
    public String getName() {
        return name;
    }

    // Encapsulation: setter (optional but good practice)
    public void setName(String name) {
        this.name = name;
    }

    // Abstract method - forces subclasses to implement (polymorphism)
    public abstract void displayDetails();
}