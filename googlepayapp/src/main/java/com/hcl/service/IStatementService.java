package com.hcl.service;



import java.util.List;

import com.hcl.entity.Transaction;
import com.hcl.exception.UserDefinedException;

public interface IStatementService {
	List<Transaction> getStatement(int pageNo, int pageSize) throws UserDefinedException;
}
