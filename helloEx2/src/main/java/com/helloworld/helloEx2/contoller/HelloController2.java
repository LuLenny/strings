package com.helloworld.helloEx2.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hello2")
public class HelloController2 {

	@GetMapping
	public String Hello2 () {
		return "Hello World!!!, Os objetivos desta semana é aprender SPRING BOOT e suas interações com ECLIPSE IDE e MYSQL.";
	}
}
