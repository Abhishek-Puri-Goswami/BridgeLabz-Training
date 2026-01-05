package com.day03.campusconnectapplication;

public abstract class Person {
	protected int id;
    protected String name;
    protected String email;

    // constructor
    public Person(int id, String name, String email) {
    	this.id = id;
    	this.name = name;
    	this.email = email;
    }
    
    // Method to display details
    protected abstract void printDetails();
}

