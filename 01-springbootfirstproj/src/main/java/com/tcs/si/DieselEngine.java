package com.tcs.si;

import org.springframework.stereotype.Component;

@Component
public class DieselEngine  implements IEngine{
	
	

	public DieselEngine() {
		
	System.out.println("DieselEngine.DieselEngine()");
	}

	@Override
	public void start() {
	 System.out.println("engine Started");	
	}

}
