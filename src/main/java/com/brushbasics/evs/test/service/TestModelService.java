package com.brushbasics.evs.test.service;

import java.util.List;

import com.brushbasics.evs.test.model.TestModel;

public interface TestModelService {
	public void saveTestModel(TestModel testModel);

	public List<TestModel> getAllTest();
}
