package com.brushbasics.evs.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brushbasics.evs.test.dao.TestModelJPARepository;
import com.brushbasics.evs.test.model.TestModel;

@Service
public class TestModelServiceImpl implements TestModelService{
	
	@Autowired
	private TestModelJPARepository testModelJPARepository;
	
	
	@Override
	public void saveTestModel(TestModel testModel) {
		testModelJPARepository.save(testModel);
	}
	
	@Override
	public List<TestModel> getAllTest(){
		return testModelJPARepository.findAll();
	}

}
