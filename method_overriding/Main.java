package method_overriding; // Declares that this class is part of the 'method_overriding' package

public class Main { // Defines the public class named 'Main'

    public static void main(String[] args) { // Entry point of the program; main method

        Derived d = new Derived(); // Creates an instance of the 'Derived' class

        d.greet(); // Calls the overridden 'greet' method, which prints "Hello from Derived"
    }
}
