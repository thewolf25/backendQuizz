package com.example.apiquiz.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "question")
public class Question implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(length = 250)
	private String description;

	@Column(length = 8)
	private String dificulty;

	@OneToMany
	@JoinColumn(name = "question_id")
	private List<OptionQuestion> options;

	/**
	 * 
	 * @return
	 */
	public long getId() {
		return id;
	}

	/***
	 * 
	 * @return
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * 
	 * @return
	 */
	public String getDificulty() {
		return dificulty;
	}

	/**
	 * 
	 * @param dificulty
	 */
	public void setDificulty(String dificulty) {
		this.dificulty = dificulty;
	}

	/**
	 * 
	 * @return
	 */
	public List<OptionQuestion> getOptions() {
		return options;
	}

	/**
	 * 
	 * @param options
	 */
	public void setOptions(List<OptionQuestion> options) {
		this.options = options;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(long id) {
		this.id = id;
	}

}
