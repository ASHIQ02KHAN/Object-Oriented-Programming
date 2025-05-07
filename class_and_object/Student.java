package class_and_object;             // Declares that this class belongs to the 'class_and_object' package

public class Student {              // Defines a public class named 'Student'

    String name;                 // Declares a string variable 'name' to store the student's name (default access)
    int id;                     // Declares an integer variable 'id' to store the student's ID (default access)

    public void display() {   // Defines a public method 'display' with no return value
        System.out.println("Name: " + name + ", ID: " + id);   // Prints the student's name and ID to the console,Concatenates string with variable values
                                
    }
}
