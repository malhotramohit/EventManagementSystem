package com.brushbasics.evs.test.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.brushbasics.evs.test.model.TestModel;

@Repository
@Transactional
public class TestModelDAOImpl extends BaseDAO implements TestModelDAO {

	@Override
	public List<TestModel> findAll() {
		return null;
	}

	@Override
	public void saveTestModel(TestModel testModel) {
		save(testModel);
	}

}
