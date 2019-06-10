package com.brushbasics.evs.test.dao;

import java.io.Serializable;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.brushbasics.evs.test.model.BaseModel;

@Repository
@Transactional
public class BaseDAO {

	@Autowired
	protected SessionFactory sessionFactory;

	protected <T extends BaseModel> void save(T obj) {
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.getTransaction();

		try {
			session.persist(obj);
			session.flush();
		} catch (Exception e) {
			transaction.rollback();
		}

	}

	protected <T extends BaseModel, I extends Serializable> Object get(Class<T> clazz, I id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(clazz, id);
	}

	protected <T extends BaseModel> void update(T obj) {
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.getTransaction();
		try {
			session.merge(obj);
			session.flush();
		} catch (Exception e) {
			transaction.rollback();
		}
	}

	protected <T extends BaseModel> void delete(T obj) {
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.getTransaction();
		try {
			session.delete(obj);
			session.flush();
		} catch (Exception e) {
			transaction.rollback();
		}
	}

}
