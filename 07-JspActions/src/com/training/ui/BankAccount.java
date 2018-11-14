package com.training.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BankAccount {
	int id;
	String customerName;
	double balance;
	Date doj;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "BankAccount [id=" + id + ", customerName=" + customerName
				+ ", balance=" + balance + "]";
	}
	public void setDate1(String str)
	{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
		try {
			Date  d1=sdf.parse(str);
			this.doj=d1;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	

}
