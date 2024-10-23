package com.example.demo11;

public class Personlnfo extends Info {

	private int age;

	private String city;

	public Personlnfo() {
		super();
	}

	public Personlnfo(int age, String city) {
		super();
		this.age = age;
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public String getCity() {
		return city;
	}

}
