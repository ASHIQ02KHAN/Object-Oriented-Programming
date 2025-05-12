package inheritance;                        // Declares that this class is part of the 'inheritance' package

public class Dog extends Animal {           // Defines a public class 'Dog' that inherits from the 'Animal' class

    void sound() {                          // Overrides the 'sound()' method of the parent class
        System.out.println("Dog barks");    // Prints a message specific to Dog's sound
    }
}
