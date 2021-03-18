package in.edac.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import in.edac.User;
import in.edac.repository.UserRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/register")
	
	public boolean register (@RequestBody User user)
	{
		try {
			if(findUser(user.getEmailId(),user.getUserName()))
				{
					return false;
				}
				else {
					userRepository.save(user);
					 return true;
		}
	}
		catch(Exception e) {
			e.printStackTrace();
			return false;
			
	}
}
	
@PostMapping("/login")
	
	public User login(@RequestBody User user)
	{

		User userdata = userRepository.findByEmailIdAndPassword(user.getEmailId(),user.getPassword());
		
		if(userdata!=null)
		{
			return userdata;
		}
		
		else
		{
			return null;
		}
	}

public boolean findUser(String emailId, String username)
{
	List<User> list = readAll();
	boolean data=false;
	for(User user:list)
	{
		if(user.getEmailId().equalsIgnoreCase(emailId) || user.getUserName().equals(username))
		{
			data = true;
			break;
		}
		
	}
	if(data==true)
	{
		return true;
	}
	else
	{
		return false;
	}
}
public List<User> readAll(){
	return userRepository.findAll();
}

	
}
