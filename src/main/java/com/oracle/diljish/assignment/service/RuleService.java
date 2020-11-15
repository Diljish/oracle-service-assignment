package com.oracle.diljish.assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.oracle.diljish.assignment.model.Rule;
import com.oracle.diljish.assignment.repos.RuleRepo;

@Component
public class RuleService {
	
	@Autowired
	RuleRepo ruleRepo;
	
	public Rule saveRule(Rule rule) {
		return ruleRepo.save(rule);
	}
	
	public List<Rule> getAllRules() {
		return ruleRepo.findAll();
	}

}
