package com.tcs.ci;

import org.springframework.stereotype.Component;

@Component
public class DieselEngine implements IEngine {

	
	public DieselEngine() {
		System.out.println("Diesel::constructor");
	}

	@Override
	public int start() {
		System.out.println("DieselEngine.start()");
		return 0;
	}

}
