package com.bank.bank;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BankUser {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	int id;
	String name;
	String bankName;
	String totalAmt;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBankName() {
		return bankName;
	}


	public void setBankName(String bankName) {
		this.bankName = bankName;
	}


	public String getTotalAmt() {
		return totalAmt;
	}


	public void setTotalAmt(String totalAmt) {
		this.totalAmt = totalAmt;
	}


	public BankUser() {
		// TODO Auto-generated constructor stub
	}


	public BankUser orElse(int id) {
		// TODO Auto-generated method stub
		return null;
	}



	}


	

