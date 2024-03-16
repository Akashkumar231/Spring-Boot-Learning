package com.akash.demo.rest;

import com.akash.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;

    // define @PostConstruct to load the student data ... only once!

    @PostConstruct
    public void loadData(){

        theStudents = new ArrayList<>();
        theStudents.add(new Student("Akashkumar","Yadav"));
        theStudents.add(new Student("Prajyot","Karkade"));
        theStudents.add(new Student("Piyush","Khandalkar"));
        theStudents.add(new Student("Om" ,"Chaudhary"));

    }

    // define endpoints for "/student" - return the list of students

    @GetMapping("/students")
    public List<Student> getStudent(){

        return theStudents;

    }

    // define endpoint or " /students/{studentId}" - return student at index

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId){

        // just index into the list ... keep it simple for now

        // check the studentId again list size

        if( (studentId >= theStudents.size()) || (studentId < 0)){


            throw new StudentNotFoundException("Student id not found - " + studentId);

        }


        return theStudents.get(studentId);



    }

}