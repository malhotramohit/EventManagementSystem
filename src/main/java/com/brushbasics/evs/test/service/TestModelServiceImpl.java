package com.brushbasics.evs.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brushbasics.evs.test.dao.TestModelDAO;
import com.brushbasics.evs.test.model.TestModel;

@Service
public class TestModelServiceImpl implements TestModelService{
	
	@Autowired
	private TestModelDAO testModelDAO;
	
	
	@Override
	public void saveTestModel(TestModel testModel) {
		testModelDAO.saveTestModel(testModel);
	}
	
	@Override
	public List<TestModel> getAllTest(){
		return testModelDAO.findAll();
	}

}
