package com.example.apiquiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apiquiz.models.Question;
import com.example.apiquiz.repository.QuestionRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Quiz App")
@CrossOrigin(origins = "*")
public class QuestionController {

	@Autowired
	QuestionRepository questionRepository;

	@GetMapping("/questions")
	@ApiOperation(value = "list of question")
	public List<Question> listOfQuestion() {
		return questionRepository.findAll();
	}

	@GetMapping("/question/{id}")
	@ApiOperation(value = "question by id")
	public Question getQuestionById(@PathVariable(value = "id") long id) {
		return questionRepository.findById(id);
	}

	@PostMapping("/create/question")
	@ApiOperation(value = "create question")
	public Question createQuestion(@RequestBody Question question) {
		return questionRepository.save(question);
	}

	@DeleteMapping("/delete/question")
	@ApiOperation(value = "Deleta uma pergunta")
	public void deletaPergunta(@RequestBody Question question) {
		questionRepository.delete(question);
	}

	@PutMapping("/update/question")
	@ApiOperation(value = "update question")
	public Question updateQustion(@RequestBody Question question) {
		return questionRepository.save(question);
	}
}
