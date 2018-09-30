package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.CalculatorService;

@RestController
public class CalculatorResource {

	@Autowired
	private CalculatorService calculatorService;
	
	
	@GetMapping("add/{a}/{b}")
	public int add(@PathVariable int a, @PathVariable int b){
		return calculatorService.add(a, b);
	}
	
	@GetMapping("sub/{a}/{b}")
	public int sub(@PathVariable int a, @PathVariable int b){
		return calculatorService.sub(a, b);
	}
	
	@GetMapping("mul/{a}/{b}")
	public int mul(@PathVariable int a, @PathVariable int b){
		return calculatorService.mul(a, b);
	}
	
	@GetMapping("div/{a}/{b}")
	public int div(@PathVariable int a, @PathVariable int b){
		return calculatorService.div(a, b);
	}
	
	
}
