package com.fabiodrneles.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabiodrneles.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
