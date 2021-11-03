package com.ss.jb.three;

public class Movie implements Comparable<Movie>{

	private String name;
	private Integer year;
	private Float rating;

	public Movie(String name, Integer year, Float rating) {
		super();
		this.name = name;
		this.year = year;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Float getRating() {
		return rating;
	}

	public void setRating(Float rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Movie [name=" + name + ", year=" + year + ", rating=" + rating + "]";
	}

	@Override
	public int compareTo(Movie o) {
		return this.year - o.year;
	}

}
