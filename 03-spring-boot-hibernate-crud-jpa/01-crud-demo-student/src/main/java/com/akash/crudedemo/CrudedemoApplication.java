package com.akash.crudedemo;

import com.akash.crudedemo.dao.StudentDAO;
import com.akash.crudedemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CrudedemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(CrudedemoApplication.class, args);
	}


    @Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){

    return runner->{

//	    createStudent(studentDAO);

	    createMultipleStudents(studentDAO);

//		readStudent(studentDAO);

//		queryForStudents(studentDAO);

//		queryForStudentsByLastName(studentDAO);


//		updateStudent(studentDAO);

//		deleteStudents(studentDAO);

//		deleteAllStudents(studentDAO);

	};

	}

	private void deleteAllStudents(StudentDAO studentDAO) {

		System.out.println("Deleting all students");
		int numRowsDeleted = studentDAO.deleteAll();
		System.out.println("Deleted row count: " +  numRowsDeleted);

	}

	private void deleteStudents(StudentDAO studentDAO) {

		int studentId = 3;
		System.out.println("Deleting the student id: " + studentId);
		studentDAO.delete(studentId);


	}

	private void updateStudent(StudentDAO studentDAO) {

		// retrieve student based on the id: primary key

		int studentId = 1;
		System.out.println("Getting student with id: " + studentId);
		Student myStudent = studentDAO.findById(studentId);

		// change first name to "Prachi"
		System.out.println("Updating student...");
		myStudent.setFirstname("Prachi");

		// update the student
		studentDAO.update(myStudent);

		// display the updated student
		System.out.println("Updated Student : " +  myStudent);

		// display the updated student.


	}

	private void queryForStudentsByLastName(StudentDAO studentDAO) {

		// get a list of students

		List<Student> theStudents = studentDAO.findByLastName("Yadav");

		// display list of students

		for (Student tempStudent : theStudents){

			System.out.println(tempStudent);

		}

	}

	private void queryForStudents(StudentDAO studentDAO) {

		// get a list of Students

		List<Student> theStudent = studentDAO.findAll();

		// display the list of students

		for(Student tempStudent : theStudent){

			System.out.println(tempStudent);

		}


	}

	private void readStudent(StudentDAO studentDAO) {


		// create a student object.
		System.out.println("Creating new student object ... ");
		Student tempStudent = new Student("Daffy" , "Duck" , "daffy@321gmail.com");


		// save the student.
		System.out.println("Saving the student object");
		studentDAO.save(tempStudent);

		// display id of the saved student.
		int theId = tempStudent.getId();
		System.out.println("Saved student . Generated Id: " + theId);

		// retrieve student based on the id: primary key
		System.out.println("Retrieving student with id : " + theId);
		Student myStudent = studentDAO.findById(theId);

		// display student.
		System.out.println("Found the student: " + myStudent);

	}



	private void createMultipleStudents(StudentDAO studentDAO) {

		System.out.println("Creating 3 Student Objects");
		Student tempStudent1 = new Student("Harsh" , "Yadav" ,"hy7970@gmail.com");
		Student tempStudent2 = new Student("Shubham" , "Yadav" ,"sy7970@gmail.com");
		Student tempStudent3 = new Student("Pranav" , "Yadav" ,"py7970@gmail.com");

		// saving the created object
		System.out.println("Saving the Objects ...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);


	}


/*

 private void createStudent(StudentDAO studentDAO) {

 	// create the student object.

 	System.out.println("Creating new student object");
 	Student tempStudent = new Student("Akashkumar" , "Yadav" ,"ay7970@gmail.com");


 	// save the student object.
 	System.out.println("Saving the student ...");
 	studentDAO.save(tempStudent);

 	// display id of the saved student.

 	System.out.println("Saved student. Generated Id: " + tempStudent.getId());



 }
*/

}
