package com.example.apiquiz.models;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "option")
public class OptionQuestion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(length = 200)
	private String description;

	@Column(length = 4)
	@JsonIgnore
	private String correct_option;

	private BigDecimal score;

	/**
	 * 
	 * @return
	 */
	public long getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
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
	public String getCorrect_option() {
		return correct_option;
	}

	/**
	 * 
	 * @param correct_option
	 */
	public void setCorrect_option(String correct_option) {
		this.correct_option = correct_option;
	}

	/**
	 * 
	 * @return
	 */
	public BigDecimal getScore() {
		return score;
	}

	/**
	 * 
	 * @param score
	 */
	public void setScore(BigDecimal score) {
		this.score = score;
	}
}