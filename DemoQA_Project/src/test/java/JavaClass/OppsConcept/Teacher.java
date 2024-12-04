package JavaClass.OppsConcept;

public class Teacher extends Person {

    private String Teachersubject;
    private int salary;


    public String getTeachersubject() {
        return Teachersubject;

    }
    public void setTeachersubject(String Teachersubject) {
        this.Teachersubject = Teachersubject;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void display() {
        System.out.println("Teacher: " + Teachersubject);
    }

    @Override
    public void displayDetails() {

        System.out.println("Teacher Details:");
        System.out.println("Name: " + getName() + ", Age: " + getAge() + ", ID: " + getId());
        System.out.println("Teachersubject: " + Teachersubject + ", salary: " + salary);

    }

    @Override
    public String toString() {
        return "Teacher{" +
                "Teachersubject='" + Teachersubject + '\'' +
                ", salary=" + salary +
                '}';
    }
}
