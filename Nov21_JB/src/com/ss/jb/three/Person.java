package com.ss.jb.three;

import java.io.Serializable;
import java.util.Objects;

/**
 * This is a POJO (Plain Old Java Obj), Domain, Model - data carrier.
 * 
 * @author ppradhan
 *
 */
public class Person implements Serializable{

	private String name;
	private String email;
	transient private Integer ssn;

	public Person(String name, String email, Integer ssn) {
		super();
		this.name = name;
		this.email = email;
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getSsn() {
		return ssn;
	}

	public void setSsn(Integer ssn) {
		this.ssn = ssn;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ssn);
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Person other = (Person) obj;
//		return Objects.equals(ssn, other.ssn);
//	}

}
