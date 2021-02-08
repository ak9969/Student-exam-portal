package com.akshat.example.Studentexamportal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.akshat.example.Studentexamportal.Controller.*;
import com.akshat.example.Studentexamportal.Dao.*;

@SpringBootApplication
public class StudentExamPortalApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentExamPortalApplication.class, args);
	}

	@Autowired
	private StudentRepo studentRepo;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		 Student student = new Student("Akshat",21);
		 Student student2 = new Student("Akshat1",22);

		 Exam exam1 = new Exam("Maths","A");
		 Exam exam2 = new Exam("Phy","A");
		 Exam exam3 = new Exam("Maths","B");
		 Exam exam4 = new Exam("Phy","B");
		 student.getTests().add(exam2);
		 student.getTests().add(exam1);
		 student2.getTests().add(exam3);
		 student2.getTests().add(exam4);
		 this.studentRepo.save(student);
		 this.studentRepo.save(student2);

		 
	}

}


