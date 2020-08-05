package com.logger.demo.test;


import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

	org.slf4j.Logger logger= LoggerFactory.getLogger(Hello.class);
	@RequestMapping("/")
	public String sayHello() {
		logger.trace("SayHello method Accessed");
		return "Hello world";
	}
}
