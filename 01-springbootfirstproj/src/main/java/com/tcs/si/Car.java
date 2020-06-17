package com.tcs.si;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	
	
	public Car() {
	
		System.out.println("car::constructor");
	}

	private IEngine eng;
	
@Autowired
	public void setEng(IEngine eng) {
	System.out.println("Car.setEng() called");
		this.eng = eng;
	}

public void drive() {
	eng.start();
	System.out.println("journey started smoothly");
}
	 

}
