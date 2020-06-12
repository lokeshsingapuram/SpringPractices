package com.tcs.ci;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car{
	private IEngine engine;
@Autowired
	public Car(IEngine engine) {
	System.out.println("car::Constructor");
		this.engine = engine;
	}
public void drive() {
	int status=engine.start();
	if(status==0)
	System.out.println("journey Started");
	else
		System.out.println("journey failed to start");
}
	
	
	

}
