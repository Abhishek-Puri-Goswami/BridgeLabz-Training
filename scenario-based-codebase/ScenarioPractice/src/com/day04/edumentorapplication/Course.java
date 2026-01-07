package com.day04.edumentorapplication;

public abstract class Course {
	protected int courseId;
    protected String courseName;
    protected Instructor instructor;
    
    // constructor to initialize a course
    public Course(int courseId, String courseName, Instructor instructor) {
    	this.courseId = courseId;
    	this.courseName = courseName;
    	this.instructor = instructor;
    }
    
    public abstract void printDetails();
}
