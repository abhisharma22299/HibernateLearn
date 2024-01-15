package com.HibernateLearn.HibernateLearn;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//this is use for the change the entire entity @Entity(name="Student_Details")
@Entity
@Table(name="MyStudentData")
public class Student {
 @GeneratedValue(strategy = GenerationType.AUTO) 
	@Id
	private int rollnumber;
	private String name;
	private int Age;


	private String city;

	public Student(int rollnumber, String name, int age, String city) {
		super();
		this.rollnumber = rollnumber;
		this.name = name;
		Age = age;
		this.city = city;

	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getRollnumber() {
		return rollnumber;
	}

	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [rollnumber=" + rollnumber + ", name=" + name + ", Age=" + Age + ", city=" + city + "]";
	}
}
