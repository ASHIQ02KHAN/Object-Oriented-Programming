package method_overloading; // Declares that this class belongs to the 'method_overloading' package

public class Overload { // Defines a public class named 'Overload'

    void show() { // Method with no parameters
        System.out.println("No parameters"); // Prints a message indicating this method takes no parameters
    }

    void show(String msg) { // Overloaded method that takes a single String parameter
        System.out.println("Message: " + msg); // Prints the message passed as an argument
    }
}
