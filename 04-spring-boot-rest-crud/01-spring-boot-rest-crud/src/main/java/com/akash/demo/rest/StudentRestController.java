package com.akash.demo.rest;

import com.akash.demo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @GetMapping("/students")
    public List<Student> getStudents(){

        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Akashkumar","Yadav","Sunil",1));
        studentList.add(new Student("Satishkumar","Yadav","Sunil",2));
        studentList.add(new Student("Akshaykumar","Yadav","Sunil",3));
        studentList.add(new Student("Akashkumar","Yadav","Sunil",4));

        return studentList;

    }

}
