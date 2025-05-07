package class_and_object;            // Declares that this class belongs to the 'class_and_object' package

public class StudentTest {           // Defines a public class named 'StudentTest'

    public static void main(String[] args) {     // Main method: entry point of the program
        Student s1 = new Student();              // Creates a new 'Student' object and assigns it to variable 's1'
        s1.name = "Kahn";                        // Sets the 'name' field of the 's1' object to "Kahn"
        s1.id = 10;                             // Sets the 'id' field of the 's1' object to 101
        s1.display();                            // Calls the 'display' method to print the student's details
    }
}
