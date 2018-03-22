package coffee.demo.service;

import coffee.demo.pojo.Users;

public interface UserService {
	
	public Users login(String username,String password);
	
	public void addUser(Users user);
	
}

