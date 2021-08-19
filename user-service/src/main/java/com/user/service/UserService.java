package com.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.user.entity.User;
import com.user.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public User saveUser(User user) {
		log.info("Inside save user service");
		return userRepository.save(user);
	}

	public User findUserById(long userId) {
		return userRepository.findById(userId).get();
	}
	
	
}
