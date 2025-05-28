package object_class_equals; // Declares that this class belongs to the 'object_class_equals' package

public class Student { // Defines a public class named 'Student'
    
    String name; // Declares a String variable to hold the student's name
    int id;      // Declares an integer variable to hold the student's ID

    public Student(String name, int id) { // Constructor to initialize the name and id
        this.name = name; // Assigns the parameter 'name' to the instance variable 'name'
        this.id = id;     // Assigns the parameter 'id' to the instance variable 'id'
    }

    public boolean equals(Object obj) { // Overrides the equals() method from the Object class
        if (this == obj) return true; // If both references point to the same object, return true
        if (!(obj instanceof Student)) return false; // If the object is not a Student, return false
        Student s = (Student) obj; // Type cast 'obj' to 'Student'
        return this.id == s.id && this.name.equals(s.name); // Compare id and name for equality
    }

    public static void main(String[] args) { // Main method to test the equality check
        Student s1 = new Student("Khan", 101); // Create first Student object
        Student s2 = new Student("Khan", 101); // Create second Student object with same data
        System.out.println("Equal? " + s1.equals(s2)); // Calls overridden equals() and prints result
    }
}
