package com.example.tutorial.jpaRepository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.tutorial.entity.User;


public interface UserRepository extends JpaRepository<User, Long>{

}
