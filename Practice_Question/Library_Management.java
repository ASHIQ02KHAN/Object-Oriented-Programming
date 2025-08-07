                             ///   Question  ////

/* "Design a simple Library Management System in Java using Object-Oriented Programming principles. 
The system should manage books, users (students), and allow issuing and returning books. 
Use inheritance, interface, abstraction, and proper method overriding. Also include:

i. Static keyword to track the total number of books.
ii. Final keyword to make a constant value (like max books a student can issue).
iii. Inner class or anonymous class to log events (like issue/return).
iv. File handling to save and read issued book records.
v. Exception handling for invalid inputs (e.g., book not found or issuing more than allowed).*/


// solution >>

package Practice_Question;

// Interface for operations
interface LibraryOperations {
    void borrowBook(String bookName);
    void returnBook(String bookName);
}

// Abstract class with common properties
abstract class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract void display(); // abstract method
}

// Final class cannot be extended
final class Book {
    private String title;
    private boolean isAvailable;

    Book(String title) {
        this.title = title;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrow() {
        isAvailable = false;
    }

    public void returned() {
        isAvailable = true;
    }
}

// Concrete class inheriting Person and implementing LibraryOperations
class Student extends Person implements LibraryOperations {
    static int totalBooksBorrowed = 0; // static member

    Student(String name, int id) {
        super(name, id);
    }

    @Override
    void display() {
        System.out.println("Student: " + name + " (ID: " + id + ")");
    }

    @Override
    public void borrowBook(String bookName) {
        System.out.println(name + " borrowed: " + bookName);
        totalBooksBorrowed++;
    }

    @Override
    public void returnBook(String bookName) {
        System.out.println(name + " returned: " + bookName);
        totalBooksBorrowed--;
    }
}

public class Library_Management {
    public static void main(String[] args) {
        // Create a student
        Student s1 = new Student("Khan", 101);
        s1.display(); // Display student info

        // Create a book
        Book b1 = new Book("Java OOP Mastery");

        // Anonymous inner class for librarian
        Person librarian = new Person("Librarian", 999) {
            @Override
            void display() {
                System.out.println("Welcome from Librarian!");
            }
        };
        librarian.display();

        // Check book availability
        if (b1.isAvailable()) {
            s1.borrowBook(b1.getTitle());
            b1.borrow(); // change availability
        }

        // Return book
        s1.returnBook(b1.getTitle());
        b1.returned(); // mark as available

        // Static field usage
        System.out.println("Total books borrowed: " + Student.totalBooksBorrowed);
    }
}
