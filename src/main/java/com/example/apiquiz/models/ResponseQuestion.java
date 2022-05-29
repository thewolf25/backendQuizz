package com.example.apiquiz.models;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "response")
public class ResponseQuestion implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@ManyToOne
	@JoinColumn(name = "option_id")
	private OptionQuestion option_id;

	@ManyToOne
	@JoinColumn(name = "question_id")
	private Question question_id;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private UserQuiz user_id;

	/**
	 * 
	 */
	private BigDecimal time_response;

	/**
	 * 
	 */
	private String name;

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
	public OptionQuestion getOption_id() {
		return option_id;
	}

	/**
	 * 
	 * @param option_id
	 */
	public void setOption_id(OptionQuestion option_id) {
		this.option_id = option_id;
	}

	/**
	 * 
	 * @return
	 */
	public Question getQuestion_id() {
		return question_id;
	}

	/**
	 * 
	 * @param question_id
	 */
	public void setQuestion_id(Question question_id) {
		this.question_id = question_id;
	}

	/**
	 * 
	 * @return
	 */
	public UserQuiz getUser_id() {
		return user_id;
	}

	/**
	 * 
	 * @param user_id
	 */
	public void setUser_id(UserQuiz user_id) {
		this.user_id = user_id;
	}

	/**
	 * 
	 * @return
	 */
	public BigDecimal getTime_response() {
		return time_response;
	}

	/**
	 * 
	 * @param time_response
	 */
	public void setTime_response(BigDecimal time_response) {
		this.time_response = time_response;
	}

	/**
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

}
