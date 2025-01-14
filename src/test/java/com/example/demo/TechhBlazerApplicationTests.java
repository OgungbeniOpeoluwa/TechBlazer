package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class TechhBlazerApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("Hello World");
	}

	@Test
	void testUserRegister(){
		assertTrue(true);
	}
}
