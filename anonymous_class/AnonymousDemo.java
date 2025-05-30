package anonymous_class; // Declares that this class belongs to the 'anonymous_class' package

abstract class Greeting { // Declares an abstract class named Greeting
    abstract void sayHello(); // Abstract method to be implemented by subclasses or anonymous classes
}

public class AnonymousDemo { // Defines the public class with the main method
    public static void main(String[] args) { // Main method where execution starts

        // Creates an anonymous class that extends Greeting and provides implementation of sayHello()
        Greeting g = new Greeting() {
            void sayHello() {
                System.out.println("Hello from anonymous class!"); // Prints custom message
            }
        };

        g.sayHello(); // Calls the implemented method of the anonymous class
    }
}
