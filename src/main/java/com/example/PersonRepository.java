package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;



public interface PersonRepository  extends JpaRepository<Person, Integer>{

	
}
