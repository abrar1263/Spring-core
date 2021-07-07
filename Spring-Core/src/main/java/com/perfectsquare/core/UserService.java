package com.perfectsquare.core;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * provides crud suppot to the users
 * @author abrar
 *
 */
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public void save(User user) {
		userRepository.save(user);
	}
	
	public void findbyid(long userId) {
		userRepository.findbyId(userId);
	}
	
	public void update(User user) {
		userRepository.update(user);
	}

	public void delete(User user) {
		userRepository.Delete(user);
	}
}
