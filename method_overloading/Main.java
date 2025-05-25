package method_overloading; // Declares that this class is part of the 'method_overloading' package

public class Main { // Defines the public class named 'Main'
    
    public static void main(String[] args) { // Main method: program execution starts here
        
        Overload ol = new Overload(); // Creates an instance of the Overload class and assigns it to variable 'ol'
        
        ol.show(); // Calls the no-argument version of the 'show' method
        
        ol.show("Overloaded version"); // Calls the overloaded version of the 'show' method with a String argument
    }
}
