package com.example.apiquiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apiquiz.models.Ranking;
import com.example.apiquiz.models.ResponseQuestion;
import com.example.apiquiz.repository.RankingRepository;
import com.example.apiquiz.repository.ResponseRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Quiz App")
@CrossOrigin(origins = "*")
public class ResponseController {

	@Autowired
	RankingRepository rankingRepository;

	@Autowired
	ResponseRepository responseRepository;

	@PostMapping("/create/response")
	@ApiOperation(value = "create a response")
	public ResponseQuestion createResponse(@RequestBody ResponseQuestion response) {
		return responseRepository.save(response);
	}

	@GetMapping("/ranking")
	@ApiOperation(value = "list des rangs")
	public List<Ranking> rankingList() {
		return rankingRepository.findByRanking();
	}
}
