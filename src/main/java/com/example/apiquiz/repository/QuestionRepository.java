package com.example.apiquiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.apiquiz.models.Question;

public interface QuestionRepository extends JpaRepository<Question, Long>{
	Question findById(long id);
}
