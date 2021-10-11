package com.hcl.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.dto.RegisterRequest;
import com.hcl.exception.UserDefinedException;
import com.hcl.service.GPayRegisterService;

@RestController
@RequestMapping("/register")
public class GPayRegisterController {
	
	@Autowired
	private GPayRegisterService gPayRegisterService;

	@PostMapping
	public ResponseEntity<String> register(@Valid @RequestBody RegisterRequest[] registerRequest) throws UserDefinedException {
		String response = gPayRegisterService.register(registerRequest);
		return new ResponseEntity<String>(response,HttpStatus.OK);

	}

}
