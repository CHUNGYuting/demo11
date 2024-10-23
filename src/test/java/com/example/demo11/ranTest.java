package com.example.demo11;

import org.junit.jupiter.api.Test;

public class ranTest {

	
		@Test
	    public void ranText ()  {
	        Human human = new Human(); 
	        Person person = new Person(); 
	        Dog dog = new Dog(); 
	        Car car = new Car();  
	              
	        human.run();
	        person.run();
	        dog.run();
	        car.run();
	    }
	
}
