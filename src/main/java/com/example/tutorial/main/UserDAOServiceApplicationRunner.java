package com.example.tutorial.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.tutorial.entity.User;
import com.example.tutorial.service.UserDAOService;

@Component
public class UserDAOServiceApplicationRunner implements ApplicationRunner {
	private static final Logger log = LoggerFactory.getLogger(UserDAOServiceApplicationRunner.class);
	
	@Autowired
	UserDAOService userDaoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		User user = new User("Vipul","Admin");
		long insert_id = userDaoService.insert(user);
		log.info("New User created"+user);
	}
}
