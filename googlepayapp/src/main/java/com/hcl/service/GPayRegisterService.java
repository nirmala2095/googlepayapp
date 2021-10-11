package com.hcl.service;


import com.hcl.dto.RegisterRequest;
import com.hcl.exception.UserDefinedException;

public interface GPayRegisterService {

	String register( RegisterRequest[] RegisterRequest) throws UserDefinedException;
}
