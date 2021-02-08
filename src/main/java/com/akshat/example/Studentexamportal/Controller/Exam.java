package com.akshat.example.Studentexamportal.Controller;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class Exam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String courseName;
    private String marks;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "DEPT_ID")
    private Student student;


    public Exam() {
    }

    public Exam(String courseName, String marks) {

        this.courseName = courseName;
        this.marks = marks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Test{" +
                "courseName='" + courseName + '\'' +
                ", marks=" + marks +
                '}';
    }
}