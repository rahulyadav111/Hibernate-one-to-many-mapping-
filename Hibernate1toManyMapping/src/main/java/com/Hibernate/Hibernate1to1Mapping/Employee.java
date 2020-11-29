package com.Hibernate.Hibernate1to1Mapping;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="emp4")
public class Employee
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="empcode",length=20)
	private int empcode;
	
	@Column(name="empname",length=20)
	private String empname;
	
	@Column(name="designation",length=20)
	private String designation;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Address addresss;
	
	public int getEmpcode() {
		return empcode;
	}
	public void setEmpcode(int empcode) {
		this.empcode = empcode;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Address getAddresss() {
		return addresss;
	}
	public void setAddresss(Address addresss) {
		this.addresss = addresss;
	}
	
	

}
