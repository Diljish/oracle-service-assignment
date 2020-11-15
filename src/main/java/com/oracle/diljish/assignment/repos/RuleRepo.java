package com.oracle.diljish.assignment.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oracle.diljish.assignment.model.Rule;

public interface RuleRepo extends JpaRepository<Rule, Long> {

}
