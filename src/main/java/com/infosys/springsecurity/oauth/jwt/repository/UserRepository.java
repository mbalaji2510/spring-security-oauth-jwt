/**
 * 
 */
package com.infosys.springsecurity.oauth.jwt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.infosys.springsecurity.oauth.jwt.model.User;

/**
 * @author kisho
 *
 */

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	
	User findOneByUsername(String username);

}
