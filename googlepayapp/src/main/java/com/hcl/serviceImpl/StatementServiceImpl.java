package com.hcl.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.entity.Transaction;
import com.hcl.exception.UserDefinedException;
import com.hcl.respositry.ITransactionRepository;
import com.hcl.service.IStatementService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

@Service
public class StatementServiceImpl implements IStatementService {


	@Autowired
	private ITransactionRepository transactionRepository;

	@Override
	public List<Transaction> getStatement(int pageNo, int pageSize) throws UserDefinedException {
		
		
		Pageable paging = PageRequest.of(pageNo, pageSize);
        Page<Transaction> pagedResult = transactionRepository.findAll(paging);

        return pagedResult.toList();
		
	}	
}