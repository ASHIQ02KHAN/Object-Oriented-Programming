package this_and_super;

public class Person {
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;  // 'this' refers to the current object's name
        this.age = age;    // 'this' refers to the current object's age
    }

    // Method to display information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
