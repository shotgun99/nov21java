package com.ss.jb.four;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.ss.jb.three.Movie;

public class StreamsDemo {

	public static void main(String[] args) {
		toUpperCase();
		sortMovies();
		typesOfStrams();
	}

	public static void toUpperCase() {
		List<String> lotrs = new ArrayList<>();
		lotrs.add("Lotr - Fellowship");
		lotrs.add("LOTR - twin towers");
		lotrs.add("lOtR - kings return");

//		List<Stream> uppercaseLotrsStream = (List<Stream>) lotrs.stream().map(String::toUpperCase);
		List<String> uppercaseLotrs = lotrs.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(uppercaseLotrs.get(0));
	}

	public static void sortMovies() {
		Movie m1 = new Movie("LOTR 1", 2000, 9.9f);
		Movie m2 = new Movie("LOTR 2", 2001, 7.9f);
		Movie m3 = new Movie("LOTR 3", 2003, 8.8f);

		List<Movie> lotrs = new ArrayList<>();
		lotrs.add(m2);
		lotrs.add(m3);
		lotrs.add(m1);
		List<Movie> ratedNineMovies = lotrs.stream().filter(p -> p.getRating() > 9).collect(Collectors.toList());

		ratedNineMovies.forEach(m -> System.out.println(m.toString()));
	}

	public static void typesOfStrams() {
		List<Integer> myIntList = new ArrayList<>();
		int ct = 1;
		while (ct <= 1000) {
			myIntList.add(ct);
			ct++;
		}

		System.out.println("PAR STREAM");
		Stream<Integer> parStream = myIntList.parallelStream();
		Stream<Integer> filParStream = parStream.filter(p -> p > 950).sorted();
		filParStream.forEach(n -> System.out.println(n));
		
		
		
		System.out.println("SEQ STREAM");
		myIntList.stream().filter(p -> p > 950).forEach(n -> System.out.println(n));
	}

}
