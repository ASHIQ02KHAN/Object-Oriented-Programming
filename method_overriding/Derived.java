package method_overriding; // Declares that this class is part of the 'method_overriding' package

public class Derived extends Base { // Defines a public class 'Derived' that inherits from the 'Base' class

    @Override // Annotation that indicates this method overrides a method from the superclass (Base)
    void greet() { // Overrides the 'greet' method defined in the Base class
        System.out.println("Hello from Derived"); // Prints a message specific to the Derived class
    }
}
