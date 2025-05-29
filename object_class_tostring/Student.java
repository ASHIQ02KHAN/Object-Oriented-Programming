package object_class_tostring; // Declares that this class is part of the 'object_class_tostring' package

public class Student { // Defines the public class named 'Student'

    String name = "Khan"; // Declares and initializes the student's name
    int id = 101;         // Declares and initializes the student's ID

    public String toString() { // Overrides the toString() method from the Object class
        return "Student[name=" + name + ", id=" + id + "]"; // Returns a formatted string representation of the object
    }

    public static void main(String[] args) { // Main method to run the program
        Student s = new Student();           // Creates a new Student object
        System.out.println(s);               // Automatically calls toString() and prints: Student[name=Khan, id=101]
    }
}
