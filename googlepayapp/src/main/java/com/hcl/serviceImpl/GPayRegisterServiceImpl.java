package com.hcl.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dto.RegisterRequest;
import com.hcl.entity.Payee;
import com.hcl.exception.UserDefinedException;
import com.hcl.respositry.IPayeeRepository;
import com.hcl.service.GPayRegisterService;

@Service
public class GPayRegisterServiceImpl implements GPayRegisterService {

	@Autowired
	public IPayeeRepository payeeRepository;

	@Override
	public String register(RegisterRequest[] registerRequest) throws UserDefinedException{

		for(int i=0; i < registerRequest.length ; i++) {


			Payee payee = new Payee();

			if (payeeRepository.findByPhoneNumber(registerRequest[i].getPhoneNumber()) == null) {

				payee.setFirstName(registerRequest[i].getFirstName());
				payee.setLastName(registerRequest[i].getLastName());
				payee.setEmailId(registerRequest[i].getEmailId());
				payee.setPhoneNumber(registerRequest[i].getPhoneNumber());

				payeeRepository.save(payee);

			}
			else {
				throw new UserDefinedException("This Phone Number is already registered :"+registerRequest[i].getPhoneNumber() );
			}
		}
		return "Payees registered successfully";
	}

}