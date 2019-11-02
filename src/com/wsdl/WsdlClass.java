package com.wsdl;

import java.util.LinkedHashMap;

import enterprise.*;

// this class will be used by wsdl service
public class WsdlClass {
// returns all films in string
	public String getAllFilms() {
		String outputData = "";
		FilmInfo fInfo = new FilmDAO();
		LinkedHashMap<String, Film> filmCollectionMap = new LinkedHashMap<String, Film>();
		// call method of list film and get collection of films and pass it to local hashMap
		filmCollectionMap = fInfo.listFilm();
		// using foreach loop to iterate through all the values
		for ( Film film : filmCollectionMap.values()) {
			// adds the film object using its toString method to the local string
			outputData += film.toString();
		}
			
		return outputData;
	}
	
	public String searchFilm(String name) {
		String outputData = "";
		String search = name.toUpperCase();
		FilmInfo fInfo = new FilmDAO();
		LinkedHashMap<String, Film> filmCollectionMap = new LinkedHashMap<String, Film>();
		filmCollectionMap = fInfo.listFilm();
		// uppercase the paramter and checks if the key exist in the map
		if (filmCollectionMap.containsKey(search)) {
			// if it does then get that film object and use its toString format to get human readable format
			// and pass the value to string
			outputData += filmCollectionMap.get(name).toString();
		}else {
			// otherwise this message
			outputData = "Unfortuantely, The movie does not exist in the Database";
		}
		
			// return the data
		return outputData;
	}
}
