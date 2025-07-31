package file_handling; // Declares the package name

import java.io.FileWriter; // Imports FileWriter for writing to files
import java.io.FileReader; // Imports FileReader for reading from files
import java.io.IOException; // Imports IOException for handling I/O errors

public class FileHandlingDemo { // Main class
    public static void main(String[] args) {

        // -------- Writing to a file --------
        try {
            FileWriter writer = new FileWriter("example.txt"); // Creates or overwrites a file named example.txt
            writer.write("Hello, this is a file handling example in Java."); // Writes content to the file
            writer.close(); // Closes the FileWriter to save changes
            System.out.println("File written successfully."); // Confirms successful write
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file."); // Error message if writing fails
            e.printStackTrace(); // Prints the error details
        }

        // -------- Reading from the file --------
        try {
            FileReader reader = new FileReader("example.txt"); // Opens the file for reading
            int character; // Variable to store character read as integer
            System.out.print("File content: ");
            while ((character = reader.read()) != -1) { // Reads one character at a time until end of file
                System.out.print((char) character); // Converts int to char and prints it
            }
            reader.close(); // Closes the FileReader after reading
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file."); // Error message if reading fails
            e.printStackTrace(); // Prints the error details
        }
    }
}
