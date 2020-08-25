package com.infosys.springsecurity.oauth.jwt.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.infosys.springsecurity.oauth.jwt.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {

	@Query("{id : ?0}")
	Optional<Employee> findById(String id);

	@Query("{id : ?0}")
	void deleteById(String id);

}
