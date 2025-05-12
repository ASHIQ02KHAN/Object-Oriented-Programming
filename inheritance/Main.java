package inheritance;                         // Declares that this class belongs to the 'inheritance' package

public class Main {                          // Defines a public class named 'Main'

    public static void main(String[] args) { // Main method: program execution starts here

        Dog d = new Dog();                   // Creates a new Dog object and stores it in variable 'd'

        d.sound();                           // Calls the overridden sound() method from the Dog class
                                             // Output: "Dog barks"
    }
}
