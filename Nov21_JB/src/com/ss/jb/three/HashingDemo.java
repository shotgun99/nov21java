package com.ss.jb.three;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class HashingDemo{

	public static void main(String[] args) {
		Person p1 = new Person("John Doe", "jdoe@gmail,com", 1234);
		Person p2 = new Person("John Doe", "jdoe@gmail,com", 1234);
		
		if(p1.equals(p2)) {
			System.out.println("Same person");
		}else {
			System.out.println("Diff person");
		}
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		Map<Person, Integer> personMap = new HashMap<>();
		personMap.put(p1, 1000);
		personMap.put(p2, 2000);
		System.out.println(personMap.size());
		System.out.println(personMap.get(p1));
		System.out.println(personMap.get(p2));
	}
}
