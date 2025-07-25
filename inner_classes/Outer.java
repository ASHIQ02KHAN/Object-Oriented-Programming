package inner_classes;

public class Outer {
    int outerData = 10;

    // Inner class
    class Inner {
        void display() {
            System.out.println("Accessing outer data: " + outerData);
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();              // Creating object of outer class
        Outer.Inner inner = outer.new Inner();  // Creating object of inner class
        inner.display();                        // Calling method of inner class
    }
}
