package com.jsp.onlinepharmacy.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.onlinepharmacy.entity.Address;
import com.jsp.onlinepharmacy.repository.AddressRepo;

@Repository
public class AddressDao {
	
	@Autowired
	private AddressRepo addressRepo;
	
	
	public Address saveAddress( Address address) {
	
		return addressRepo.save(address);
	}
}


