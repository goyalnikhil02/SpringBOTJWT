package com.example;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Repository
@RestController
public class UserController {

	// http://blog.netgloo.com/2014/10/06/spring-boot-data-access-with-jpa-hibernate-and-mysql/

	@Autowired
	private UserDao userDao;
	
	  private final Logger log = LoggerFactory.getLogger(this.getClass());
		

	// private static final Logger logger =
	// LoggerFactory.getLogger(UserController.class);

	@RequestMapping("/api/login") // this will return the login page
	public String home() {
		return "login";
	}

	@RequestMapping("/all")
	public List<User> allUser() {
		User user = null;
		List<User> al = null;
		try {
			// EntityManager.class
			return al;

		} catch (Exception ex) {
			System.out.println("Error creating the user: " + ex.toString());
		}
		// return "User succesfully created! (id = " + user.getId() + ")";
		return al;
	}

	/**
	 * /create --> Create a new user and save it in the database.
	 * 
	 * @param email
	 *            User's email
	 * @param name
	 *            User's name
	 * @return A string describing if the user is succesfully created or not.
	 */

	// @RequestMapping(value = "/create", method = RequestMethod.GET)
	@RequestMapping("/create")
	public String create(String email, String name) {
		User user = null;
		try {
			user = new User(email, name);
			userDao.save(user);
			// logger.info("Welcome home! user is createdand user name is {}.",
			// user.getName());

		} catch (Exception ex) {
			return "Error creating the user: " + ex.toString();
		}
		return "User succesfully created! (id = " + user.getId() + ")";
	}

	/**
	 * /delete --> Delete the user having the passed id.
	 * 
	 * @param id
	 *            The id of the user to delete
	 * @return A string describing if the user is succesfully deleted or not.
	 */
	@RequestMapping("/delete")

	public String delete(long id) {
		try {
			User user = new User(id);
			userDao.delete(user);
		} catch (Exception ex) {
			return "Error deleting the user: " + ex.toString();
		}
		return "User succesfully deleted!";
	}

	/**
	 * /get-by-email --> Return the id for the user having the passed email.
	 * 
	 * @param email
	 *            The email to search in the database.
	 * @return The user id or a message error if the user is not found.
	 */
	@RequestMapping("/getbyemail")

	public String getByEmail(String email) {
		String userId;
		String userName;
		try {
			User user = userDao.findByEmail(email);
			userId = String.valueOf(user.getId());
			userName = user.getName();
			// logger.info("Welcome home! searching by email id and username is
			// {}.", user.getName());

		} catch (Exception ex) {
			return "User not found";
		}
		return "The user name is: " + userName + " and user id is :" + userId;
	}

	/**
	 * /update --> Update the email and the name for the user in the database
	 * having the passed id.
	 * 
	 * @param id
	 *            The id for the user to update.
	 * @param email
	 *            The new email.
	 * @param name
	 *            The new name.
	 * @return A string describing if the user is succesfully updated or not.
	 */
	@RequestMapping("/update")

	public String updateUser(long id, String email, String name) {
		try {
			User user = userDao.findOne(id);
			user.setEmail(email);
			user.setName(name);
			userDao.save(user);
		} catch (Exception ex) {
			return "Error updating the user: " + ex.toString();
		}
		return "User succesfully updated!";
	}

	@RequestMapping("/getbyusername")
	public String getByUserName(String name) {
		String userId;
		String userEmail;
		try {
			User user = userDao.findByName(name);
			userId = String.valueOf(user.getId());
			userEmail = user.getEmail();
		} catch (Exception ex) {
			return "User not found";
		}
		return "The Email id and the id of the user " + name + " is Email id:" + userEmail + " and  ID " + userId + ".";
	}

	
	@RequestMapping("/userinfo/{id}")
	public User getUserINFOBYID(@PathVariable long id) throws Exception {
		String userName;
		String userEmail;
		User user=null;
		
			user.getEmail();
			log.info("The getUserINFOBYID method called with parameter input value :"+ id);
			user = userDao.findOne(id);
			userEmail = user.getEmail();
			userName = user.getName();
		
		log.info("The "+user.getClass()+":: getUserINFOBYID method called with output value :"+ user.getEmail()+"::"+user.getName());
		
		return user; //"The Email id and the id of the user " + userName + " is Email id:" + userEmail;
	}

}
