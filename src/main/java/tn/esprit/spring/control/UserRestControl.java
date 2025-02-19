package tn.esprit.spring.control;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import tn.esprit.spring.entities.User;
import tn.esprit.spring.services.IUserService;

// userRestControl
@RestController // = @Controller + @ResponseBody 
@RequestMapping("/user")
public class UserRestControl {

	@Autowired 
	IUserService userService; 

	
	// URL : http://localhost:????/????/????/retrieve-all-users
	@GetMapping("/retrieve-all-users")
	public List<User> retrieveAllUsers() {
		return userService.retrieveAllUsers();
		//return list;
	}
 
	// http://localhost:????/timesheet-devops/retrieve-user/{user-id}
	@GetMapping("/retrieve-user/{user-id}")
	public User retrieveUser(@PathVariable("user-id") String userId) {
		return userService.retrieveUser(userId);
	}
	
	 

	// Ajouter User : http://localhost:????/timesheet-devops/add-user 
	@PostMapping("/add-user")
	public User addUser(@RequestBody User u) {
		User user = userService.addUser(u); 
		return user;
	}

	
	// Supprimer User : 
	// http://localhost:????/timesheet-devops/remove-user/{user-id}
	@DeleteMapping("/remove-user/{user-id}") 
	public void removeUser(@PathVariable("user-id") String userId) { 
		userService.deleteUser(userId);
	} 

	// Modifier User 
	// http://localhost:????/timesheet-devops/modify-user 
	@PutMapping("/modify-user") 
	public User updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}
	 
} 
 