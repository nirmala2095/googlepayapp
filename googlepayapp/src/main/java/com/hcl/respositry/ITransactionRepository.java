package com.hcl.respositry;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.hcl.entity.Transaction;

public interface ITransactionRepository extends PagingAndSortingRepository<Transaction, Long> {
	
}
