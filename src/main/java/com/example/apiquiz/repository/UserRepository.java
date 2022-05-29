package com.example.apiquiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.apiquiz.models.UserQuiz;



public interface UserRepository extends JpaRepository<UserQuiz, Long>{
	UserQuiz findById(long id);
}
