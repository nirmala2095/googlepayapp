package com.hcl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import com.hcl.entity.Transaction;
import com.hcl.exception.UserDefinedException;
import com.hcl.service.IStatementService;

@RestController
@RequestMapping("/statement/{pageNo}/{pageSize}")
public class StatementController {

	@Autowired
	private IStatementService statementService;  
	
	@GetMapping
	public ResponseEntity<List<Transaction>> getStatement(@PathVariable int pageNo, 
	        @PathVariable int pageSize)
			throws UserDefinedException {
		List<Transaction> transactions = statementService.getStatement(pageNo, pageSize);

		 return new ResponseEntity<List<Transaction>>(transactions,HttpStatus.OK);

	}
}
