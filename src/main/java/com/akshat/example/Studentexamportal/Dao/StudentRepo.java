package com.akshat.example.Studentexamportal.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akshat.example.Studentexamportal.Controller.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

}
