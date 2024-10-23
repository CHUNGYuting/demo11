package com.example.demo11;

public class Son extends Father {

	public Son(String name) {
		super();
		super.name = name;
	}

	public Son(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public Son() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void playBall() {
		System.out.println(getName() + " is playBall");
	}

}
