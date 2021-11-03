package com.ss.jb.three;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareMovies {

	public static void main(String[] args) {
		Movie m1 = new Movie("LOTR 1", 2000, 9.9f);
		Movie m2 = new Movie("LOTR 2", 2001, 7.9f);
		Movie m3 = new Movie("LOTR 3", 2003, 9.8f);
		
		List<Movie> lotrs = new ArrayList<>();
		lotrs.add(m2);
		lotrs.add(m3);
		lotrs.add(m1);
		
		System.out.println("Before ordering");
		for(Movie m: lotrs) {
			System.out.println(m.toString());
		}
		
		System.out.println("Ordering by year");
		Collections.sort(lotrs);
		for(Movie m: lotrs) {
			System.out.println(m.toString());
		}
		
		System.out.println("Ordering by rating");
		Collections.sort(lotrs, new RatingComparator());
		for(Movie m: lotrs) {
			System.out.println(m.toString());
		}
		
		
//		List myList = new ArrayList();
//		myList.add("SOME STRING");
//		myList.add(1234);
//		myList.add(m1);
//		
//		Movie myMovie = (Movie) myList.get(2);
		
	}

}
