package com.tutorial.JavaSpringAPI.repository;

import com.tutorial.JavaSpringAPI.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

//Maps User model and the type of its id
public interface UserRepository extends JpaRepository<User,String> {

}
