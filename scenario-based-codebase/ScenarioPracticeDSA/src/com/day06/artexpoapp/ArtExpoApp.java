package com.day06.artexpoapp;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

public class ArtExpoApp {
    public static void main(String[] args) {
		System.out.println("============== ArtExo Exibition ==============\n");
		
		Exhibition exhibition = new Exhibition();
		
		// Added example artists
		List<Artist> artists = Arrays.asList(
				new Artist("A001", "Divyansh da Vinci", LocalTime.of(16, 01)),
				new Artist("A002", "Akshat da Vinci", LocalTime.of(02, 41)),
				new Artist("A003", "Ashish da Vinci", LocalTime.of(23, 27)),
				new Artist("A004", "Hariom da Vinci", LocalTime.of(05, 29)),
				new Artist("A005", "Aryan da Vinci", LocalTime.of(12, 35)),
				new Artist("A006", "Anuj da Vinci", LocalTime.of(14, 58))
				); 
		
		for(int i = 0; i < artists.size(); i++) {
			Artist artist = artists.get(i);
			System.out.println(">> New Artist arrived: " + artist.getName());
			exhibition.addArtist(artist);
			exhibition.printArtists();
		}
		
		System.out.println("\n=========== Finished Artists Registration =============");
	}
}
