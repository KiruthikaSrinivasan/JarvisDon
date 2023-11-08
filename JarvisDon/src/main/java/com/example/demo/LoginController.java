package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@Autowired
	private LoginService loginService;

	@GetMapping(value = "/getlistofstudents", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<LoginDTO> getlistofstudents(@RequestParam String name) {
		return loginService.getlistofstudents(name);
	}
}