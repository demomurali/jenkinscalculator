package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.service.CalculatorService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	
	@Autowired
	private CalculatorService calculatorService;
	
	@Test
	public void contextLoads() {

	}

	
	@Test
	public void addServiceTest(){
		assertEquals(9,calculatorService.add(4, 5));
	}
	

	@Test
	public void subServiceTest(){
		assertEquals(1,calculatorService.sub(5, 4));
	}
	
	
	@Test
	public void mulServiceTest(){
		assertEquals(20,calculatorService.mul(4, 5));
	}

	
	@Test
	public void divServiceTest(){
		assertEquals(2,calculatorService.div(4, 2));
	}

	
	
}
