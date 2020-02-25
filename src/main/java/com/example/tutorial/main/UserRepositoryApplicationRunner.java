package com.example.tutorial.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.tutorial.entity.Question;
import com.example.tutorial.entity.User;
import com.example.tutorial.jpaRepository.UserRepository;


@Component
public class UserRepositoryApplicationRunner implements ApplicationRunner {

	private static final Logger log = LoggerFactory.getLogger(UserRepositoryApplicationRunner.class);

	
	 @Autowired 
	 private UserRepository userRepo;
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		User user = new User("Raj","User");
		userRepo.save(user);
		log.info("User Successfully created"+user);
		
		Optional<User> userWithIdOne = userRepo.findById(1L);
		log.info("User with ID one"+userWithIdOne);
		
		List<User> userList = userRepo.findAll();
		log.info("User details :"+userList);
		
		
	}

}
