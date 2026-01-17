package com.day06.artexpoapp;

import java.util.ArrayList;

public class Exhibition {
    private ArrayList<Artist> artists = new ArrayList<>();
    
    public void addArtist(Artist a) {

    	// For correct index position (insertion sort)
    	int i = 0;
    	while(i < artists.size() && artists.get(i).getTimestamp().isBefore(a.getTimestamp())) {
    		i++;
    	}
    	
    	// added artist there
    	artists.add(i, a);
    	System.out.println(">> Artist registered: " + a + " at place " + (i + 1));
    }
    
    public void printArtists() {
    	System.out.println(">> Exibition list now has " + artists.size());
    	for(int i = 0; i < artists.size(); i++) {
    		Artist artist = artists.get(i);
    		System.out.println(" " + (i + 1) + ". " + artist);
    	}
    	System.out.println("---------------------------------------------");
    }
}
