package com.day06.artexpoapp;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Artist {
    private String id;
    private String name;
    private LocalTime timestamp;
    
    public Artist(String id, String name, LocalTime timestamp) {
    	this.id = id;
    	this.name = name;
    	this.timestamp = timestamp;
    }
    
    @Override
    public String toString() {
    	return name + " (" + id + ") at " + timestamp.format(DateTimeFormatter.ofPattern("HH:mm"));
    }
    
    public String getName() {
    	return name;
    }
    
    public LocalTime getTimestamp() {
    	return timestamp;
    }
}
