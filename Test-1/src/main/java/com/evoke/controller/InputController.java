package com.evoke.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import com.evoke.entity.Input;
@RestController
public class InputController {

	@GetMapping("/echo")
public String welcome()
{
	return "Welcome..";
}
	@GetMapping("/dates")
	public String GetDates(Input ip)
	{
		return ip.getSdate() +" &"+ip.getEdate();
	}
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> responseEntity(Exception ex,WebRequest req)
	{
		return new ResponseEntity<Object>("Invalid Date Format", HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
