package com.example.demo.DemoController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	@RequestMapping("/main")
	public String api()
	{
		return "welcome!!!";
	}
	@RequestMapping
	
		public String call()
		{
			return "HII";
		}
	
	

}
