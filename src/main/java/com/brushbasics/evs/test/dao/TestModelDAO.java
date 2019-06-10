package com.brushbasics.evs.test.dao;

import java.util.List;

import com.brushbasics.evs.test.model.TestModel;

public interface TestModelDAO {

	List<TestModel> findAll();

	void saveTestModel(TestModel testModel);

}
