package com.tcs.source;

import org.springframework.stereotype.Component;

@Component("de")
public class DieselEngine implements IEngine {

	@Override
	public int start() {
		System.out.println("DieselEngine.start()");
		return 0;
	}
	

}
