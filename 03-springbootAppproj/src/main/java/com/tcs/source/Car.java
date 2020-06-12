package com.tcs.source;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Autowired
	@Qualifier("de")
	private IEngine eng;
	
	public void drive() {
		eng.start();
		System.out.println("journey started smoothly");
	}

}
