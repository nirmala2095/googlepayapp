package com.hcl.respositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.entity.Payee;

public interface IPayeeRepository extends JpaRepository<Payee,Long>{
Payee findByPhoneNumber(String phoneNumber);
}
