package com.jsp.onlinepharmacy.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;
	private String customerName;
	private String Email;
	private long phoneNumber;
	private String password;

	@ManyToMany
	private List<Address> addresses;
	
	@OneToMany(mappedBy ="customer")
	private List<Booking>bookings;

}
