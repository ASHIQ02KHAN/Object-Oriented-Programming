package abstraction;                         // Declares that this class is part of the 'abstraction' package

public class Dog extends Animal {            // Defines a public class 'Dog' that inherits from abstract class 'Animal'

    void makeSound() {                       // Provides implementation for the abstract method 'makeSound'
        System.out.println("Dog barks");     // Prints a message specific to Dog's sound
    }
}
