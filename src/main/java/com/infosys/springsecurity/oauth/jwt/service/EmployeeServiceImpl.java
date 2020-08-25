package com.infosys.springsecurity.oauth.jwt.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.springsecurity.oauth.jwt.model.Employee;
import com.infosys.springsecurity.oauth.jwt.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl {
 
    
    @Autowired
    EmployeeRepository dao;
 
   
    public void createEmployee(Employee emp) {
        dao.save(emp);
    }
 
    
    public Collection<Employee> getAllEmployees() {
        return dao.findAll();
    }
 
    
    public Optional<Employee> findEmployeeById(String id) {
        return dao.findById(id);
    }
 
    
    public void deleteEmployeeById(String id) {
        dao.deleteById(id);
    }
 
    
    public void updateEmployee(Employee emp) {
        dao.save(emp);
    }
 
    
    public void deleteAllEmployees() {
        dao.deleteAll();
    }

	
}