package com.example.demo11;

public class Submarine extends Boat implements Dive {

	@Override
	public void diving() {
		System.out.println("¼ç¤ô¸¥¥¿¦b¶]!!");
	}

	@Override
	public void move() {
		System.out.println("run!!run!!run!!");
	}

}
