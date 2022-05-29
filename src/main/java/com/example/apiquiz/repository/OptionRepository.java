package com.example.apiquiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.apiquiz.models.OptionQuestion;

public interface OptionRepository extends JpaRepository<OptionQuestion, Long>{
	OptionQuestion findById(long id);
}