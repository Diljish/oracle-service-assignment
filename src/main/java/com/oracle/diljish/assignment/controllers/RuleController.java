package com.oracle.diljish.assignment.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

import com.oracle.diljish.assignment.constant.RuleConstant;
import com.oracle.diljish.assignment.model.Response;
import com.oracle.diljish.assignment.model.Rule;
import com.oracle.diljish.assignment.service.RuleService;



@RestController
@CrossOrigin("*")
@RequestMapping("/ruleapi")
public class RuleController {
	
	@Autowired
	RuleService ruleService;
	
	@SuppressWarnings("rawtypes")
	@PostMapping(value = "/saverule")
	    public ResponseEntity saveRule(@RequestBody  Rule rule) {
		 Rule ruleValue = new Rule();
		 try {
			 ruleValue = ruleService.saveRule(rule);
			 
			 return ResponseEntity.ok().body(new Response(ruleValue,RuleConstant.OK,RuleConstant.RULE_SAVED));
		 } catch(Exception e) {
			 return ResponseEntity.badRequest().body(new Response(null,RuleConstant.BAD,RuleConstant.RULE_NOT_SAVED));
		 }
	    }
	
	@SuppressWarnings("rawtypes")
	@GetMapping(value = "/getrules")
    public ResponseEntity getRules() {
		List<Rule> ruleList = new ArrayList<>();
	 try {
		 ruleList = ruleService.getAllRules();
		 return ResponseEntity.ok().body(new Response(ruleList,RuleConstant.OK,RuleConstant.RULES_FETCHED));
	 } catch(Exception e) {
		 return ResponseEntity.badRequest().body(new Response(null,RuleConstant.BAD,RuleConstant.RULES_NOT_FETCHED));
	 }
    }

}
