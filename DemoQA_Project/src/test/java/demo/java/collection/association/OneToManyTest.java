package demo.java.collection.association;

import java.util.ArrayList;
import java.util.List;

// Book class
class Book {
    private String bookName;
    private String author;

    // Getter and Setter methods
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "BookName: " + bookName + ", Author: " + author;
    }
}

// Student class
class Student {
    private String studentName;
    private String studentID;
    private List<Book> borrowedBooks; // One-to-many association

    // Constructor to initialize the list
    public Student() {
        borrowedBooks = new ArrayList<>();
    }

    // Getter and Setter methods
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void addBook(Book book) {
        borrowedBooks.add(book);
    }

    @Override
    public String toString() {
        return "StudentName: " + studentName + ", StudentID: " + studentID;
    }
}

// Main class to test the one-to-many relationship
public class OneToManyTest {

    public static void main(String[] args) {
        // Creating Books
        Book book1 = new Book();
        book1.setBookName("Java Programming");
        book1.setAuthor("John Doe");

        Book book2 = new Book();
        book2.setBookName("Python Basics");
        book2.setAuthor("Jane Smith");

        Book book3 = new Book();
        book3.setBookName("Data Structures");
        book3.setAuthor("Robert Martin");

        // Creating a Student
        Student student = new Student();
        student.setStudentName("Ram");
        student.setStudentID("123");

        // Associating multiple books with one student
        student.addBook(book1);
        student.addBook(book2);
        student.addBook(book3);

        // Displaying the student and their books
        System.out.println("Student Details:");
        System.out.println(student);

        System.out.println("\nBooks Borrowed by " + student.getStudentName() + ":");
        for (Book book : student.getBorrowedBooks()) {
            System.out.println(book); // Will call the toString() method of Book
        }
    }
}
