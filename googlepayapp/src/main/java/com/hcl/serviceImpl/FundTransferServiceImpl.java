package com.hcl.serviceImpl;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dto.FundTransferRequest;
import com.hcl.entity.Payee;
import com.hcl.entity.Transaction;
import com.hcl.exception.UserDefinedException;
import com.hcl.respositry.IPayeeRepository;
import com.hcl.respositry.ITransactionRepository;
import com.hcl.service.IFundTransferService;

@Service
public class FundTransferServiceImpl implements IFundTransferService {


	@Autowired
	private ITransactionRepository transactionRepository;

	@Autowired
	private IPayeeRepository payeeRepository;

	@Override
	public String fundTransfer(FundTransferRequest fundTransferRequest) throws UserDefinedException {

		Payee fromPayee = payeeRepository.findByPhoneNumber(fundTransferRequest.getFromPhoneNumber());
		if(fromPayee == null) {
			return "From Phonumber is not a valid number";
		}
		Payee toPayee = payeeRepository.findByPhoneNumber(fundTransferRequest.getToPhoneNumber());
		if(toPayee == null) {
			return "To Phonumber is not a valid number";
		}

		Transaction transaction = new Transaction();
		// to set local time
		java.util.Date date = new java.util.Date();
		long time = date.getTime();
		Timestamp transactiondate = new Timestamp(time);
		transaction.setTransactionDate(transactiondate);
		transaction.setAmount(fundTransferRequest.getAmount());
		transaction.setFromPhoneNumber(fundTransferRequest.getFromPhoneNumber());
		transaction.setToPhoneNumber(fundTransferRequest.getToPhoneNumber());	
		transaction.setComments(fundTransferRequest.getComments());	
		transactionRepository.save(transaction);

		return "Fund transfer is succesful";
	}
}