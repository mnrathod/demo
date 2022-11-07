package com.codemagic.loanmanagement;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int id;
	private String name;
	private String email;
	private String mobile;
	private String PAN;
	private String AADHAR;
	private int residentialStatus;
	private Date creationDate;
	private Date modificationDate;
	//private Address address;
	
	
}
