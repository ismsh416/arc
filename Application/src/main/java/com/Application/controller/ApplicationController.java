package com.Application.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

	@RequestMapping()
	public String printer() {
		
		return "Welcome!!!!";
		
	}

	@RequestMapping("/date")
	public String DateShow(@RequestParam("StartDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date StartDate,
			@RequestParam("EndDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date EndDate) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MMM-dd");
		String start = formatter.format(StartDate);
		String end = formatter.format(EndDate);
		
		System.out.println("printer called");
		return "Start Date:" + start + " & End Date :" + end;

	}
}
