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

import com.example.apiquiz.models.OptionQuestion;
import com.example.apiquiz.repository.OptionRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Quiz App")
@CrossOrigin(origins = "*")
public class OptionController {

	@Autowired
	OptionRepository optionRepository;

	@GetMapping("/options")
	@ApiOperation(value = "list of options")
	public List<OptionQuestion> listaOpcoes() {
		return optionRepository.findAll();
	}

	// list of specific option
	@GetMapping("/option/{id}")
	@ApiOperation(value = "option by id")
	public OptionQuestion getOption(@PathVariable(value = "id") long id) {
		return optionRepository.findById(id);
	}

	// create option
	@PostMapping("/create/option")
	@ApiOperation(value = "create option")
	public OptionQuestion createOption(@RequestBody OptionQuestion optionQuestion) {
		return optionRepository.save(optionQuestion);
	}

	// Delete option
	@DeleteMapping("/delete/option")
	@ApiOperation(value = "Delete option")
	public void deleteOption(@RequestBody OptionQuestion optionQuestion) {
		optionRepository.delete(optionQuestion);
	}

	// Edit option
	@PutMapping("/edit/option")
	@ApiOperation(value = "edit option")
	public OptionQuestion editOption(@RequestBody OptionQuestion optionQuestion) {
		return optionRepository.save(optionQuestion);
	}
}
