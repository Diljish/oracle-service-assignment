package com.oracle.diljish.assignment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class Rule {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String eventName;
	private String leftOperant;
	private String leftOperantType;
	private String rightOperant;
	private String rightOperantType;
	private String operator;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getLeftOperant() {
		return leftOperant;
	}
	public void setLeftOperant(String leftOperant) {
		this.leftOperant = leftOperant;
	}
	public String getLeftOperantType() {
		return leftOperantType;
	}
	public void setLeftOperantType(String leftOperantType) {
		this.leftOperantType = leftOperantType;
	}
	public String getRightOperant() {
		return rightOperant;
	}
	public void setRightOperant(String rightOperant) {
		this.rightOperant = rightOperant;
	}
	public String getRightOperantType() {
		return rightOperantType;
	}
	public void setRightOperantType(String rightOperantType) {
		this.rightOperantType = rightOperantType;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	
	
	
	
	
	
	
	

}
