package object_class_methods;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Riad", 1);
        Person p2 = new Person("Riad", 1);

        System.out.println("p1.toString(): " + p1); // toString()
        System.out.println("p1.equals(p2): " + p1.equals(p2)); // equals()
        System.out.println("p1.hashCode(): " + p1.hashCode()); // hashCode()
        System.out.println("p1.getClass(): " + p1.getClass()); // getClass()
    }
}
