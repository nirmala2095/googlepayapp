package com.hcl.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Transaction")
public class Transaction {

	@Id
	@SequenceGenerator(name = "transaction_id", sequenceName = "transaction_sequence", initialValue = 300, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "transaction_id")
	@Column(name = "transactionId")
	private long transactionId;

	@Column(name = "transactionDate")
	private Date transactionDate;

	@Column(name = "amount")
	private Double amount;

	@Column(name = "fromPhoneNumber")
	private String fromPhoneNumber;
	
	@Column(name = "toPhoneNumber")
	private String toPhoneNumber;

	@Column(name = "comments")
	private String comments;
	
	public long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

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

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

}
