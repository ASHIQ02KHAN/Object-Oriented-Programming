package abstraction;                      // Declares that this class is part of the 'abstraction' package

abstract class Animal {                   // Declares an abstract class named 'Animal'
                                          // Abstract classes cannot be instantiated directly

    abstract void makeSound();            // Declares an abstract method 'makeSound' with no body
                                          // Subclasses must override this method and provide implementation
}
