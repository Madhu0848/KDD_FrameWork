package demo.java.collection.association;

class Books{
    private String BookName;
    private String Author;

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }
}
class Students{
    private String StudentName;
    private String StudentID;

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String studentID) {
        StudentID = studentID;
    }
}
public class OneToOneTest {
    public static void main(String[] args) {

        Books books = new Books();
        books.setBookName("Java");
        books.setAuthor("John");
        System.out.println("books Name :"+books.getBookName());
        System.out.println("books Author :"+books.getAuthor());
        Students students = new Students();
        students.setStudentName("ram");
        students.setStudentID("123");
        System.out.println("students Name :" + students.getStudentName());
        System.out.println("students Author :"+students.getStudentID());
    }
}
