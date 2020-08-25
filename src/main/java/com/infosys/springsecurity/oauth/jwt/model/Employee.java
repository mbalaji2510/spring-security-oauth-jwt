package com.infosys.springsecurity.oauth.jwt.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "employee")
public class Employee {
 
	@Id
    private String id;
    private String name;
    private String designation;
    private List<Address> addresses;
 
    public Employee() { }   

	public Employee(String id, String name, String designation, List<Address> addresses) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.addresses = addresses;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", addresses=" + addresses
				+ "]";
	}
 
    
}