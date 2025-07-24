package static_keyword; // Declares the package name

public class StaticTest { // Defines a public class named StaticTest

    public static void main(String[] args) { // Main method, entry point of the program

        new StaticExample(); // Creates first object → count = 1
        new StaticExample(); // Creates second object → count = 2
        new StaticExample(); // Creates third object → count = 3

        // Each time, constructor of StaticExample runs and prints updated count
    }
}
