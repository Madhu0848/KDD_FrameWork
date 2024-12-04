package demo.java.collection.service;

import JavaClass.OppsConcept.Teacher;
import demo.java.collection.model.Student;

import java.util.List;

public interface Services {

    public void addStudent(List<Student> student);
    public void removeStudent(List<Student> student);

   public void addTeacher(Teacher teacher);
   public void removeTeacher(Teacher teacher);

   void studentDetails(List<Student> student);


}
