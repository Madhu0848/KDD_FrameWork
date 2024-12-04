package demo.java.collection.service;

import JavaClass.OppsConcept.Teacher;
import demo.java.collection.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceImplementation implements Services{

    @Override
    public void addStudent(List<Student> student) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name: ");
        String name = sc.nextLine();
        System.out.println("Enter student age: ");
        int age= sc.nextInt();
        System.out.println("Enter student id: ");
        int id = sc.nextInt();

        Student s1 = new Student();
        s1.setId(id);
        s1.setName(name);
        s1.setAge(age);
      //  ArrayList list = new ArrayList();
        student.add(s1);
        //list.add(s1);

    }
    @Override
    public void studentDetails(List<Student> student) {

        Student s1 = student.get(0);
        System.out.println("Enter student name: "+s1.getName());
        System.out.println("Enter student age: "+s1.getAge());
        System.out.println("Enter student id: "+s1.getId());

    }


    @Override
    public void removeStudent(List<Student> student) {

        Student s1 = student.get(0);

       Scanner sc = new Scanner(System.in);
       int id = sc.nextInt();
       System.out.println("Enter student id: "+id);
       for(Object data : student) {
           if (data.equals(s1.getId())) {
               student.remove(s1.getId());
               break;
           }
       }
        System.out.println("Enter student name: "+s1.getId());



    }

    @Override
    public void addTeacher(Teacher teacher) {


    }

    @Override
    public void removeTeacher(Teacher teacher) {

    }


}
