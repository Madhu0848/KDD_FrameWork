package JavaClass.OppsConcept;


import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {

       public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name: ");
        String name = sc.next();
        System.out.println("Enter student ID: ");
        int id = sc.nextInt();
        System.out.println("Enter student age: ");
        int age = sc.nextInt();

        System.out.println("Enter TeacherSubject");
        String TeacherSubject=sc.next();

        System.out.println("Enter salary");
        int salary=sc.nextInt();

        System.out.println("Enter student's marks");
        int marks = sc.nextInt();
        System.out.println("Enter student's ID");
        String course = sc.next();

        Student s =new Student();
        s.setCourse(course);
        s.setMarks(marks);
        s.setId(id);
        s.setName(name);
        s.setAge(age);

        ArrayList<Student> students=new ArrayList<>();
        students.add(s);

        Teacher t = new Teacher();
        t.setSalary(salary);
        t.setTeachersubject(TeacherSubject);
        t.setId(id);
        t.setName(name);
        t.setAge(age);

        ArrayList<Teacher> teachers=new ArrayList<>();
        teachers.add(t);
        for(Object m:students){
            System.out.println(m);
        }

      // s.displayDetails();
      // s.calculateMarks();


       //t.displayDetails();


    }
}
