package com.brushbasics.evs.test.dao;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brushbasics.evs.test.model.TestModel;

public interface TestModelJPARepository extends JpaRepository<TestModel, BigDecimal> {

}
