package com.training.entity;

import java.util.Date;

import javax.persistence.Entity;
@Entity
public class Customer {

int id;
String name;
int gender;
String email,phone,address;
Date doj;
boolean privilaged;
String description;
double balanceAmount;
int customerRating;


public double getBalanceAmount() {
	return balanceAmount;
}
public void setBalanceAmount(double balanceAmount) {
	this.balanceAmount = balanceAmount;
}
public int getCustomerRating() {
	return customerRating;
}
public void setCustomerRating(int customerRating) {
	this.customerRating = customerRating;
}
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
public int getGender() {
	return gender;
}
public void setGender(int gender) {
	this.gender = gender;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Date getDoj() {
	return doj;
}
public void setDoj(Date doj) {
	this.doj = doj;
}
public boolean isPrivilaged() {
	return privilaged;
}
public void setPrivilaged(boolean privilaged) {
	this.privilaged = privilaged;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Customer other = (Customer) obj;
	if (id != other.id)
		return false;
	return true;
}
@Override
public String toString() {
	return "Customer [id=" + id + ", name=" + name + ", gender=" + gender
			+ ", email=" + email + ", phone=" + phone + ", address=" + address
			+ ", doj=" + doj + ", privilaged=" + privilaged + ", description="
			+ description + ", balanceAmount=" + balanceAmount
			+ ", customerRating=" + customerRating + "]";
}




}
