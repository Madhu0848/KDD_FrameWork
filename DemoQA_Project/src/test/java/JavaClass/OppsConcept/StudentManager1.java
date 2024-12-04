package JavaClass.OppsConcept;


import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager1 {

    public static void main(String[] args) {
        int input;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the option ");
            System.out.println("1.add student");
            System.out.println("2.add  Teacher");
            System.out.println("3.add   Exit");
            input = sc.nextInt();

            switch (input) {
                case 1:
                    System.out.println("Enter student name: ");
                    String name = sc.next();
                    System.out.println("Enter student ID: ");
                    int id = sc.nextInt();
                    System.out.println("Enter student age: ");
                    int age = sc.nextInt();
                    System.out.println("Enter student's marks");
                    int marks = sc.nextInt();
                    System.out.println("Enter student's ID");
                    String course = sc.next();
                    Student s = new Student();
                    s.setCourse(course);
                    s.setMarks(marks);
                    s.setId(id);
                    s.setName(name);
                    s.setAge(age);
                    ArrayList<Student> students = new ArrayList<>();
                    students.add(s);

                    s.calculateMarks();
                    s.displayDetails();

                case 2:
                    System.out.println("Enter TeacherSubject");
                    String TeacherSubject = sc.next();

                    System.out.println("Enter salary");
                    int salary = sc.nextInt();
                    Teacher t = new Teacher();
                    t.setSalary(salary);
                    t.setTeachersubject(TeacherSubject);
                    ArrayList<Teacher> teachers = new ArrayList<>();
                    teachers.add(t);

                    t.displayDetails();

                case 3:
                    System.out.println("Exit");
                    break;

            }
        } while (input != 3);

    }


    }









