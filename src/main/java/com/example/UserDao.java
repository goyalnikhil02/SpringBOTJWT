package com.example;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.lang.String;
import com.example.User;
import java.util.List;

@Transactional
//@Repository
public interface UserDao extends CrudRepository<User, Long> {
	
	User findByEmail(String email);
	User findByName(String name);
	Iterable<User> findAll();
	/*@Override
	default User findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}*/


}
