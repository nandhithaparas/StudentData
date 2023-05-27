package com.example.Students.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;

@Entity
@Transactional
@Table(name="Student")
public class Students {
	public Students(int id, String name, String department, String phonenumber, int age) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.phonenumber = phonenumber;
		this.age = age;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String department;
	private String phonenumber;
	private int age;
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Students(){
		
	}
	//public Address getAddress() {
//		return address;
//	}
//
//
//	public void setAddress(Address address) {
//		this.address = address;
//	}
//		@OneToOne(cascade =CascadeType.ALL)
//		@JoinColumn(name="fk_add_id")
//		private Address address;
		//uni_directional one to one
		//--> using the employee table we enter the values for address table



	/* one to one*/
	  
	
//	
	@OneToMany(cascade =CascadeType.ALL)
	@JoinColumn(name="fk_add_id",referencedColumnName="id")
	private List<Address> address;


	public List<Address> getAddress() {
		return address;
	}


	public void setAddress(List<Address> address) {
		this.address = address;
	}
		
	
}
