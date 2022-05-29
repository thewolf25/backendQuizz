package com.example.apiquiz.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.apiquiz.models.ResponseQuestion;

public interface ResponseRepository extends JpaRepository<ResponseQuestion, Long> {
	ResponseQuestion findById(long id);

	List<ResponseQuestion> findAll();

	ResponseQuestion save(ResponseQuestion resposta);
}
