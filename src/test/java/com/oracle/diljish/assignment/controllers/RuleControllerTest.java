package com.oracle.diljish.assignment.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.oracle.diljish.assignment.model.Rule;
import com.oracle.diljish.assignment.service.RuleService;

import static org.hamcrest.CoreMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.stubbing.Answer;

@RunWith(SpringRunner.class)
@WebMvcTest(RuleController.class)
public class RuleControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private RuleService ruleService;
	
	@Test
	public void getAllRules() throws Exception {
		List<Rule> ruleList = new ArrayList<>();
		
		when(ruleService.getAllRules()).thenReturn(ruleList);
		
		RequestBuilder request = MockMvcRequestBuilders.get("/ruleapi/getRules")
				.accept(MediaType.APPLICATION_JSON);
		
		MvcResult result = mockMvc.perform(request).andExpect(status().isOk())
				.andExpect((ResultMatcher) content().json("{}")).andReturn();
				
	}

}
