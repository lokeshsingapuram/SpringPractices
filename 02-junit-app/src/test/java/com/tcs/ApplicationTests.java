package com.tcs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.tcs.source.Calculator;

@SpringBootTest
class ApplicationTests {
	
	private static Calculator calc=null;
	//Instead of @ignore is not working so we use @disabled
	//Instead of @Beforeclass we use @BeforeAll
	//Instead of @Afterclass we use @AfterAll 

	@BeforeAll
	public static void init() {
		calc=new Calculator();
		
	}
	
	@Test
	@Disabled	
	void testadd_01() {
		Integer actual = calc.add(100, 200);
		Integer expected=300;
		assertEquals(expected, actual);
		
	
	}
	
	@Test
	void testadd_02() {
		Integer actual = calc.add(200, 200);
		Integer expected=400;
		assertEquals(expected, actual);
		
	
	}
	@Test
	void testadd_03() {
		Integer actual = calc.add(100, 200);
		Integer expected=300;
		assertEquals(expected, actual);
		
	
	}
	@Test
	void testadd_04() {
		Integer actual = calc.multiplication(10, 20);
		Integer expected=200;
		assertEquals(expected, actual);
		
	
	}
	@AfterAll
	public static void destroy() {
		calc=null;
		
	}
	

}
