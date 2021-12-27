package com;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SecController {
	
	@GetMapping("/home")
	public String home() {
		return "Welcome";
	}
	@PreAuthorize("hasAnyRole('user','admin')")
	@GetMapping("/user")
	public String user() {
		return "Welcome User!";
	}
	@PreAuthorize("hasRole('admin')")
	@GetMapping("/admin")
	public String admin() {

		return ("<h1>Welcome Admin!!<h1>");
	}
	
}
