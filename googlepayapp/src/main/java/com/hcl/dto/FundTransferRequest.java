package com.hcl.dto;


import java.sql.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FundTransferRequest {

	

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}


	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	@NotNull(message="please enter correct From phone number")	
	private String fromPhoneNumber;

	public String getFromPhoneNumber() {
		return fromPhoneNumber;
	}

	public void setFromPhoneNumber(String fromPhoneNumber) {
		this.fromPhoneNumber = fromPhoneNumber;
	}

	public String getToPhoneNumber() {
		return toPhoneNumber;
	}

	public void setToPhoneNumber(String toPhoneNumber) {
		this.toPhoneNumber = toPhoneNumber;
	}

	@NotNull(message="please enter correct To phone number")	
	private String toPhoneNumber;

	@NotNull(message="please enter amount")
	@Positive(message="please enter postive value")
	@Min(100)
	@Max(9000)
	private Double amount;

	@NotNull(message="comments should nopt be empty")	
	private String comments;
	
	@NotNull(message="Date should nopt be empty")	
	private Date transactionDate;


}
