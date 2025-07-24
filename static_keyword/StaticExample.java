package static_keyword; // Declares that this class belongs to the 'static_keyword' package

public class StaticExample { // Defines a public class named StaticExample

    static int count = 0; // 'static' variable shared across all instances of the class

    StaticExample() { // Constructor called every time a new object is created
        count++; // Increments the static variable (shared by all objects)
        System.out.println("Object count: " + count); // Prints the current count
    }
}
