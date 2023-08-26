package com.jsp.onlinepharmacy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.onlinepharmacy.dao.AddressDao;
import com.jsp.onlinepharmacy.dto.AddressDto;
import com.jsp.onlinepharmacy.entity.Address;
import com.jsp.onlinepharmacy.util.ResponseStructure;

@Service
public class AddressService {
	
	@Autowired
     private AddressDao addressDao;
	
	public ResponseEntity<ResponseStructure<AddressDto>> saveAddress(Address address) {
		
		Address dbAddress = addressDao.saveAddress(address); 
				
		AddressDto dto =new AddressDto();
		dto.setAddressId(dbAddress.getAddressId());
		dto.setCity(dbAddress.getCity());
		dto.setPincode(dbAddress.getPincode());
		dto.setStreetName(dbAddress.getStreetName());
		dto.setState(dbAddress.getState());
		
		ResponseStructure<AddressDto>responseStructure= new ResponseStructure<AddressDto>();
		responseStructure.setMassage("Address Saved Succesfully");
		responseStructure.setStatus(HttpStatus.CREATED.value());
		responseStructure.setData(dto);
		
		
		return new ResponseEntity<ResponseStructure<AddressDto>>(responseStructure, HttpStatus.CREATED);
		
	}
	
    

}
