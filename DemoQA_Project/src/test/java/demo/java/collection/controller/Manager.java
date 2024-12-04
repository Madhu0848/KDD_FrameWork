package demo.java.collection.controller;

import demo.java.collection.model.Student;
import demo.java.collection.service.ServiceImplementation;
import demo.java.collection.service.Services;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    public static void main(String[] args) {

        List<Student> students = new ArrayList();
        Services services = new ServiceImplementation();
        services.addStudent(students);
        services.studentDetails(students);


    }
}
