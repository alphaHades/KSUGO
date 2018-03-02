package com.seniorproject.patrick.ksugo;

import java.util.ArrayList;

/**
 * Created by patri on 2/20/2018.
 */

public class Course {
    private ArrayList<Assignments> assignments=new ArrayList<Assignments>();
    private String courseName;
    private String courseSectionNumber;
    private String professorName;
    private ArrayList<String> studentList=new ArrayList<String>();
    private ArrayList<String> announcemnts= new ArrayList<String>();

    public Course(String courseName, String courseSectionNumber, String professorName) {
        this.courseName = courseName;
        this.courseSectionNumber = courseSectionNumber;
        this.professorName = professorName;
    }
    public void populateStudents(){}
    public void populateAssignments(){}

    public void addAssignment(Assignments assignment){
        assignments.add(assignment);
    }
    public void addAnnoucements(String annoucement){
        announcemnts.add(annoucement);
    }
    public ArrayList<Assignments> getAssignments() {
        return assignments;
    }

    public void setAssignments(ArrayList<Assignments> assignments) {
        this.assignments = assignments;
    }
    public void deleteAnnoucement(int annoucementIndex){
        announcemnts.remove(annoucementIndex);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseSectionNumber() {
        return courseSectionNumber;
    }

    public void setCourseSectionNumber(String courseSectionNumber) {
        this.courseSectionNumber = courseSectionNumber;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }
    public String getStudent(int studentID){
        return studentList.get(studentID);
    }

    public ArrayList<String> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<String> studentList) {
        this.studentList = studentList;
    }



}
