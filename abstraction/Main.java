package abstraction;                          // Declares that this class is part of the 'abstraction' package

public class Main {                           // Defines a public class named 'Main'

    public static void main(String[] args) {  // Main method: program execution starts here

        Animal a = new Dog();                 // Creates a Dog object but stores it in an Animal reference
                                              // This is abstraction + runtime polymorphism

        a.makeSound();                        // Calls the overridden makeSound() method from Dog class
                                              // Output: "Dog barks"
    }
}
