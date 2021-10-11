package com.hcl.service;

import com.hcl.dto.FundTransferRequest;
import com.hcl.exception.UserDefinedException;

public interface IFundTransferService {
	String fundTransfer( FundTransferRequest fundTransferRequest) throws UserDefinedException;
	//List<GetStatementRequest> getMonthlyStatement(long accountNo, int month, int year) throws UserDefinedException;

}
