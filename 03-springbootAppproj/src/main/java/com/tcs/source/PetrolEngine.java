package com.tcs.source;

import org.springframework.stereotype.Component;

@Component("pe")
public class PetrolEngine implements IEngine{
	@Override
	public int start() {
		System.out.println("PetrolEngine.start()");
		return 0;
	}

}
