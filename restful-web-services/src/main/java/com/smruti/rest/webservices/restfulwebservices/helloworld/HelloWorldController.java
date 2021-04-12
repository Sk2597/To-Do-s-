package com.smruti.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//controller

@CrossOrigin(origins = "http://localhost:4200")
@RestController   //tells spring that this is a controller
public class HelloWorldController {
	
	//GET
	//URI - uniform resource identifier (the end point)
	//method - returns "Hello World"
	
//	@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
	
	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
//		return new HelloWorldBean("Hello World");
		throw new RuntimeException("Error Occured! Contact Support at ****");
	}
	
	//hello-world/path-variable/smruti
	@GetMapping(path = "/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World, %s",name));
	}
	
	

}
