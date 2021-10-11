package com.hcl.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.dto.FundTransferRequest;
import com.hcl.exception.UserDefinedException;
import com.hcl.service.IFundTransferService;

@RestController
@RequestMapping("/fundtransfer")
public class FundTransferController {

	@Autowired
	private IFundTransferService transactionService;  
	
	@PostMapping
	public ResponseEntity<String> fundTransfer(@Valid @RequestBody FundTransferRequest fundTransferRequestDTO)
			throws UserDefinedException {
		String response = transactionService.fundTransfer(fundTransferRequestDTO);

		 return new ResponseEntity<String>(response,HttpStatus.OK);

	}
}
