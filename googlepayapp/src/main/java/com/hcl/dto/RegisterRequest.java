package com.hcl.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {


	@NotEmpty(message = "firstName should not be empty")
	@Size(min = 3, max = 20, message = " firstName should less than 20 character only")
	private String firstName;

	@NotEmpty(message = "lastName should not be empty")
	@Size(min = 3, max = 20, message = " lastName should less than 20 character only")
	private String lastName;

	@NotEmpty(message = "emailId should not be empty")
	@Email
	@Size(min = 5, max = 100, message = "EmailId size should  be below 100 characterstics only")
	private String emailId;

	@NotEmpty(message = "Please provide a Mobile Number")
	@Pattern(regexp = "(^$|[0-9]{10})", message = "Provide valid Mobile Number")
	@Size(max = 10, message = "phone number is of 10 digits")
	private String phoneNumber;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
