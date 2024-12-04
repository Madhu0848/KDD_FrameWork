package JavaClass.OppsConcept;

public class Student extends Person {
    private int marks;
    private String course;

    public int getMarks() {

        return marks;
    }
    public void setMarks(int marks) {

        this.marks = marks;
    }
    public String getCourse() {


        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }

    public void calculateMarks() {

       if(marks>70){
           System.out.println("A");
       }
       if(marks>50){
            System.out.println("B");       }
       if(marks>30){
           System.out.println("C");
       }


    }
    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + getName() + ", Age: " + getAge() + ", ID: " + getId());
        System.out.println("Course: " + course + ", Marks: " + marks);
    }

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                ", course='" + course + '\'' +
                '}';
    }
}
